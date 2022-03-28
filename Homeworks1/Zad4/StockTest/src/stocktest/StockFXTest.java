/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package stocktest;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class StockFXTest extends Application {

    public static void messageDialog(String infoMessage, String titleBar, String headerMessage) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }

    public static String inputDialog(String infoMessage, String titleBar, String headerMessage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(titleBar);
        dialog.setHeaderText(headerMessage);
        dialog.setContentText(infoMessage);
        return dialog.showAndWait().get();

    }
    
    @Override
    public void start(Stage primaryStage) {
        String message;
        double percent;
        String symbol = inputDialog("Въведете символа на запаса", "Символ", null);
        String name = inputDialog("Въведете наименованието на запаса", "Наименование", null);
        double previous = Double.parseDouble(inputDialog("Въведете предишната цена:", "Предишна цена", null));
        double current = Double.parseDouble(inputDialog("Въведете текущата цена:", "Текуща цена", null));
        Stock stock = new Stock(symbol, name);
        stock.setPreviousClosingPrice(previous);
        stock.setCurrentPrice(current);
        percent = stock.changePercent();
        message = String.format("Процента на изменение на цената на запаса е: %.2f%%", percent);
        messageDialog(message, "Процен на изменение на цената", null);
        Platform.exit();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

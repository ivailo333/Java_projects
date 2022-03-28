/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package rectanglefx;

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
public class RectangleFXMain extends Application {

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
        Rectangle rect = new Rectangle();
        String message;
        String message1;
        String message2;
        double width = Double.parseDouble(inputDialog("Въведете дължината на правоъгълника:", "Дължина на правоъгълника", null));
        double height = Double.parseDouble(inputDialog("Въведете ширината на правоъгълника:", "Ширината на правоъгълника", null));
        String color = inputDialog("Въведете цвета на правоъгълника", "Цвят на правоъгълника", null);
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setColor(color);
        double perimeter = rect.getPerimeter();
        double area = rect.getArea();
        message1 = String.valueOf(perimeter);
        message2 = String.valueOf(area);
        message = "Дължината на правоъгълника е: " + message1 + "\nШирината на правоъгълника е: " + message2 + "\nЦвета е: " + color;
        messageDialog(message, "Характеристики на правоъгълника", null);
        Platform.exit();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

} //end class RectangleFXMain

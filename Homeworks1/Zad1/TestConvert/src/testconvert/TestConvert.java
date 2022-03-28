/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package testconvert;

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
public class TestConvert extends Application {

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
        Fahrenheit fahrenheit = new Fahrenheit();
        Celsius celsius = new Celsius();
        String message1;
        String message2;
        double fahr = Double.parseDouble(inputDialog("Въведете температурата по Фаренхайт:", "Фаренхайт", null));
        fahrenheit.setFahrenheit(fahr);
        celsius.setCelsius(fahrenheit.convertToCelsius());
        message1 = String.format("Въведената температура %.2f градуса по Фаренхайт се конвертира в %.2f градуса по Целзий", fahr, celsius.getCelsius());
        messageDialog(message1, "Конвертиране от Фаренхайт към Целзий", null);

        double cels = Double.parseDouble(inputDialog("Въведете температурата по Целзий:", "Целзий", null));
        celsius.setCelsius(cels);
        fahrenheit.setFahrenheit(celsius.convertToFahrenheit());
        message2 = String.format("Въведената температура %.2f градуса по Целзий се конвертира в %.2f градуса по Фаренхайт", cels, fahrenheit.getFahrenheit());
        messageDialog(message2, "Конвертиране от Целзий към Фаренхайт", null);
        Platform.exit();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

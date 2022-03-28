/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package fivedigitnumberfx;

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
public class FiveDigitNumberFXMain extends Application {

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
        double probability;
        int totalCount = 89999;
        int countA = 0;
        int countB = 0;
        FiveDigitNumber number = new FiveDigitNumber();
        int fiveNumber = Integer.parseInt(inputDialog("Въведете едно петцифрено число:", "Петцифрено число", null));
        number.setNumber(fiveNumber);
        while (number.getNumber() != 0) {
            countA = countA + 1;
            if (number.getNumber() % 12 == 0) {
                countB = countB + 1;
            }
            fiveNumber = Integer.parseInt(inputDialog("Въведете едно петцифрено число:", "Петцифрено число", null));
            number.setNumber(fiveNumber);
        }
        probability = (double) countB / (double) totalCount;
        message = String.format("Вероятността на произволно избрано петцифрено число е %.10f. %nБроят на числата с тези свойства е %d. %nБроята на числата със зададеното свойство е %d.%n", probability, countA, countB);

        //message=String.valueOf(number.getFirst())+"\n"+String.valueOf(number.getSecond())+"\n"+String.valueOf(number.getThird())+"\n"+String.valueOf(number.getFourth())+"\n"+String.valueOf(number.getFifth());
        //messageDialog(message, "Цифри", null);
        messageDialog(message, "Вероятност", null);
        //message = String.valueOf(countB);
        //messageDialog(message, "Брой", null);
        Platform.exit();
    } //end class FiveDigitNumberFXMain

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

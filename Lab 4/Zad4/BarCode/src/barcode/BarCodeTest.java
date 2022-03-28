/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barcode;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BarCodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int zip;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number:");
        zip = input.nextInt();
        BarCode barcode = new BarCode();
        String code;
        code = barcode.decode(zip);
        System.out.println(code);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caesar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CaesarTest {

    public static void main(String[] args) {
        int choice;
        String plain;
        String cipher;
        String plain2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input number 1 or 2:");
        System.out.println("1.Encode.");
        System.out.println("2.Decode.");
        choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.print("Input number for SHIFT_LENGTH:");
                int shift = input.nextInt();
                System.out.println();
                System.out.print("Input PLAIN TEXT:");
                plain = input.next();
                Caesar cezar = new Caesar(shift);
                plain = plain.toUpperCase();
                cipher = cezar.encription(plain);
                System.out.println(cipher);
                break;
            case 2:
                System.out.print("Input number for SHIFT_LENGTH:");
                int shift2 = input.nextInt();
                System.out.println();
                System.out.print("Input CIPHER TEXT:");
                cipher = input.next();
                Caesar cezar2 = new Caesar(shift2);
                cipher = cipher.toUpperCase();
                plain2 = cezar2.decription(cipher);
                System.out.println(plain2);
        }   
    }
}

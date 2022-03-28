/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routecipher;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RouteCipherTest {
    public static void main(String[] args) {
        String plain = new String();
        int key;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the key:");
        key = input.nextInt();
        System.out.print("Enter the text:");
        plain = input.next();
        RouteCipher route = new RouteCipher(key);
        route.encrypt(plain);
        System.out.println();
    }
}

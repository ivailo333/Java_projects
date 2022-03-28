/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcipher;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TransCipherTest {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input plain text:");
        String plaintext=input.next();
        System.out.println("Input phrase key text:");
        String key_phrase=input.next();
        String ciphertext;
        String plaintext2;
        TransCipher transCipher=new TransCipher(key_phrase);
        ciphertext=transCipher.encription(plaintext);
        plaintext2=transCipher.decription(ciphertext);
        System.out.println(ciphertext);
        System.out.println();
        System.out.println(plaintext2);
    }
}

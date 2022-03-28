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
public class RouteCipher {
    
    private int key;

    
    
    public RouteCipher(int key) {
        this.key = key;
    }

    
    /**
     * Get the value of key
     *
     * @return the value of key
     */
    public int getKey() {
        return key;
    }

    /**
     * Set the value of key
     *
     * @param key new value of key
     */
    public void setKey(int key) {
        this.key = key;
    }

    
    public String encrypt(String plainText) {
        String cipherText = new String();
        int rows;
        int cols;
        int k = 0;
        char charPlaintText[] = plainText.toCharArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of the rows:");
        rows = input.nextInt();
        System.out.print("Enter number of the cols:");
        cols = input.nextInt();
        char matrix[][] = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (k < charPlaintText.length) {
                    matrix[i][j] = charPlaintText[k];
                    k++;
                }
                
                if ((k > charPlaintText.length) && (k < (rows * cols))) {
                    matrix[i][j] = 'x';
                }
            }
        }
        
        System.out.println(k);
        System.out.println(charPlaintText.length);
        for (int ii = 0; ii < rows; ii++) {
            for (int jj = 0; jj < cols; jj++) {
                System.out.printf("%c ", matrix[ii][jj]);
            }
            System.out.println();
        }
        return cipherText;
    }
    
    
}

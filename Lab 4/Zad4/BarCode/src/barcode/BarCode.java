/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barcode;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class BarCode {

    private final int[][] code = {{1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 1, 0, 1}, {0, 0, 1, 1, 0}, {0, 1, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 0}, {1, 0, 0, 0, 1}, {1, 0, 0, 1, 0}, {1, 0, 1, 0, 0}};

    /**
     * Get the value of code
     *
     * @return the value of code
     */
    /**
     * Get the value of code at specified index
     *
     * @param index the index of code
     * @return the value of code at specified index
     */
    public int[] getCode(int index) {
        return this.code[index];
    }

    public String decode(int zip) {
        String barcode = new String();
        String str_code;
        char character=' ';
        int digitals[] = new int[3];
        char characters[] = new char[5];
        for (int i = 0; i < 3; i++) {
            digitals[i] = zip % 10;
            zip = zip / 10;
        }
        for (int k = 0; k < digitals.length; k++) {
            str_code = Arrays.toString(this.getCode(digitals[k]));
            characters = str_code.toCharArray();
            for (int l = 0; l < characters.length; l++) {
                
                switch (characters[l]) {
                    case '0':
                        character = ':';
                        System.out.printf("%s ", character);
                        break;
                    case '1':
                        character = '|';
                        System.out.printf("%s ", character);
                        break;
                }
            }
            System.out.println();
        }
        return barcode;
    }
}

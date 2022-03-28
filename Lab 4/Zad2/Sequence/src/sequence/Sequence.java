/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequence;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number;
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input sequence from numbers while input zero (0):");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while (number != 0) {
            numbers.add(number);
            number = input.nextInt();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        numbers.clear();
    }
    
}

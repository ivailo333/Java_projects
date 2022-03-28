/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menutest;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ComputeByMenu {

    private double x; //any floating point number

    //Constructor with parameter
    public ComputeByMenu() {
        this.x = 0.00;
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public double getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(double x) {
        this.x = x;
    }

    //Clears the text screen and displays the menu
    public void displayMenu() {
        for (int i = 1; i <= 50; i++) {
            System.out.println();
        }
        System.out.println("Моля изберете една от дадените опции:");
        System.out.println("1. Въведи числото X с плаваща запетая;");
        System.out.println("2. Пресметни и изведи exp(x);");
        System.out.println("3. Пресметни и изведи sin(x);");
        System.out.println("4. Пресметни и изведи floor(x);");
        System.out.println("5. Край.");
    }

    //Executes the selected option
    public void doSelection(int choice) {
        String str = "";
        double exp;
        double sin;
        int floor;
        Scanner input = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.print("Въведете едно число с плаваща запетая:");
                this.x = input.nextDouble();
                break;
            case 2:
                exp = Math.exp(this.x);
                str = String.format("Експонентата на числото %.2f е %.2f.", this.x, exp);
                break;
            case 3:
                sin = Math.sin(this.x);
                str = String.format("Синуса на числото %.2f е %.2f.", this.x, sin);
                break;
            case 4:
                floor = (int) Math.floor(this.x);
                str = String.format("Най-голямото цяло число на числото %.2f е %d.", this.x, floor);
                break;
            default:
                System.exit(0);
        }
        System.out.println(str);
    }

    //Displays the menu and performs its functions
    public void getUserChoice() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Моля изберете една от дадените опции:");
        System.out.println("1. Въведи числото X с плаваща запетая;");
        System.out.println("2. Пресметни и изведи exp(x);");
        System.out.println("3. Пресметни и изведи sin(x);");
        System.out.println("4. Пресметни и изведи floor(x);");
        System.out.println("5. Край.");
        System.out.print("Въведете едно цяло число (1-5):");

        choice = input.nextInt();
        while ((choice >= 1) || (choice <= 5)) {
            switch (choice) {
                case 1:
                    this.doSelection(1);
                    break;
                case 2:
                    this.doSelection(2);
                    break;
                case 3:
                    this.doSelection(3);
                    break;
                case 4:
                    this.doSelection(4);
                    break;
                default:
                    this.doSelection(5);
            }
            System.out.println("Моля изберете една от дадените опции:");
            System.out.println("1. Въведи числото X с плаваща запетая;");
            System.out.println("2. Пресметни и изведи exp(x);");
            System.out.println("3. Пресметни и изведи sin(x);");
            System.out.println("4. Пресметни и изведи floor(x);");
            System.out.println("5. Край.");
            System.out.print("Въведете едно цяло число (1-5):");
            choice = input.nextInt();
        }

    }
}

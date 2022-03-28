/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testconvert;

/**
 *
 * @author user
 */
public class Fahrenheit {
    
    private double fahrenheit;

    
    public Fahrenheit() {
        this.fahrenheit = 0;
    }
    
    /**
     * Get the value of fahrenheit
     *
     * @return the value of fahrenheit
     */
    

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    /**
     * Set the value of fahrenheit
     *
     * @param fahrenheit new value of fahrenheit
     */
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double convertToCelsius() {
        double celsius;
        celsius = (5.0 / 9.0) * (this.fahrenheit - 32);
        return celsius;
    }
}

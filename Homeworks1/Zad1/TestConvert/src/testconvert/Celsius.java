/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testconvert;

/**
 *
 * @author user
 */
public class Celsius {
    
    private double celsius;

    public Celsius() {
        this.celsius = 0;
    }
    
    
    /**
     * Get the value of celsius
     *
     * @return the value of celsius
     */
    public double getCelsius() {
        return this.celsius;
    }

    /**
     * Set the value of celsius
     *
     * @param celsius new value of celsius
     */
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    
    public double convertToFahrenheit() {
        double fahrenheit;
        fahrenheit=(9.0/5.0)*this.celsius+32;
        return fahrenheit;
    }
    
}

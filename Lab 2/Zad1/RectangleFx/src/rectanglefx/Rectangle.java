/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectanglefx;

/**
 *
 * @author user
 */
public class Rectangle {

    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "yellow";

    }

    public Rectangle(double width, double height) {
        this.width = (width > 0.00) ? width : 0.00;
        this.height = (height > 0.00) ? height : 0.00;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(double height) {
        this.height = (height > 0.00) ? height : 0.00;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(double width) {
        this.width = (width > 0.00) ? width : 0.00;
    }

    public double getPerimeter() {
        double perimeter;
        double w = getWidth();
        double h = getHeight();
        perimeter = 2 * w + 2 * h;
        return perimeter;
    }
    
    public double getArea() {
        double area;
        double ww = getWidth();
        double hh = getHeight();
        area = ww * hh;
        return area;
    }
    
} //end class Rectangle

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stocktest;

/**
 *
 * @author user
 */
public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * Get the value of symbol
     *
     * @return the value of symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value of currentPrice
     *
     * @return the value of currentPrice
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Set the value of currentPrice
     *
     * @param currentPrice new value of currentPrice
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Get the value of previousClosingPrice
     *
     * @return the value of previousClosingPrice
     */
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * Set the value of previousClosingPrice
     *
     * @param previousClosingPrice new value of previousClosingPrice
     */
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double changePercent() {
        double percent;
        percent = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
        return percent;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fivedigitnumberfx;

/**
 *
 * @author user
 */
public class FiveDigitNumber {

    private int Number;
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;

    public FiveDigitNumber() {
        this.Number = 10000;
    }

    /**
     * Get the value of first
     *
     * @return the value of first
     */
    public int getFirst() {
        first = this.Number / 10000;
        first = first % 10;
        if ((first >= 3) && (first <= 9)) {
            return first;
        } else {
            return 0;
        }
    }

    /**
     * Get the value of second
     *
     * @return the value of second
     */
    public int getSecond() {
        second = this.Number / 1000;
        second = second % 10;
        if ((second >= 2) && (second <= 8)) {
            return second;
        } else {
            second = 0;
            return second;
        }
    }

    /**
     * Get the value of third
     *
     * @return the value of third
     */
    public int getThird() {
        third = this.Number / 100;
        third = third % 10;
        if ((third >= 4) && (third <= 9)) {
            return third;
        } else {
            third = 0;
            return third;
        }
    }

    /**
     * Get the value of fourth
     *
     * @return the value of fourth
     */
    public int getFourth() {
        fourth = this.Number / 10;
        fourth = fourth % 10;
        if ((fourth >= 1) && (fourth <= 6)) {
            return fourth;
        } else {
            fourth = 0;
            return fourth;
        }
    }

    /**
     * Get the value of fifth
     *
     * @return the value of fifth
     */
    public int getFifth() {
        fifth = this.Number;
        fifth = fifth % 10;
        if ((fifth >= 6) && (fifth <= 9)) {
            return fifth;
        } else {
            fifth = 0;
            return fifth;
        }
    }

    /**
     * Get the value of Number
     *
     * @return the value of Number
     */
    public int getNumber() {
        first = this.getFirst();
        second = this.getSecond();
        third = this.getThird();
        fourth = this.getFourth();
        fifth = this.getFifth();
        if ((first == 0) || (second == 0) || (third == 0) || (fourth == 0) || (fifth == 0)) {
            return 0;
        }
        return this.Number;
    }

    /**
     * Set the value of Number
     *
     * @param Number new value of fiveDigitNumber
     */
    public void setNumber(int Number) {
        if ((Number >= 10000) && (Number <= 99999)) {
            this.Number = Number;
        } else {
            this.Number = 0;
        }
    }
} //end class FiveDigitNumber

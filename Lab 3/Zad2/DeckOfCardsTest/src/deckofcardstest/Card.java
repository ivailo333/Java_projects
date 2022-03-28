/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deckofcardstest;

/**
 *
 * @author user
 */
public class Card {
    
    private String face; // face of card ("Ace", "Deuce", ...)
    private String suit; // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace; // initialize face of card
        this.suit = cardSuit; // initialize suit of card
    } // end two-argument Card constructor

    public String getFace() {
        return face;
    } //get value from face
    
    public String getSuit() {
        return suit;
    } // get value from suit
    
    @Override
    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    } // end method toString
} // end class Card

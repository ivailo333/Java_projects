/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deckofcardstest;

/**
 *
 * @author user
 */
public class DeckOfCardsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for (int i = 0; i < 13; i++) {
            // deal and print 4 Cards
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
        } // end for
    } // end main
} // end class DeckOfCardsTest

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caesar;

/**
 *
 * @author user
 */
public class Caesar {

    private final char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private int shift_length;

    public Caesar(int shift_length) {
        this.shift_length = shift_length;
    }

    /**
     * Get the value of shift_length
     *
     * @return the value of shift_length
     */
    public int getShift_length() {
        return shift_length;
    }

    /**
     * Set the value of shift_length
     *
     * @param shift_length new value of shift_length
     */
    public void setShift_length(int shift_length) {
        this.shift_length = shift_length;
    }

    /**
     * Get the value of letters at specified index
     *
     * @param index the index of letters
     * @return the value of letters at specified index
     */
    public char getLetters(int index) {
        return this.letters[index];
    }

    //Function for encrption Caesar cipher
    public String encription(String plaintext) {
        String ciphertext;
        char tempory;
        int index = 0;
        int index2 = 0;
        char original[] = plaintext.toCharArray();
        char cipher[] = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            tempory = original[i];
            while (tempory != this.getLetters(index)) {
                index++;
            }
            index2 = (index + this.getShift_length()) % letters.length;
            cipher[i] = this.getLetters(index2);
            index = 0;
        }
        ciphertext = new String(cipher);
        return ciphertext;
    }
    
    //Function for decription Caesar cipher
    public String decription(String ciphertext) {
        String plaintext;
        char tempory;
        int index = 0;
        int index2 = 0;
        char cipher[] = ciphertext.toCharArray();
        char plain[] = new char[cipher.length];
        for (int i = 0; i < cipher.length; i++) {
            tempory = cipher[i];
            while (tempory != this.getLetters(index)) {
                index++;
            }
            index2 = ((index + letters.length) - this.getShift_length()) % letters.length;
            plain[i] = this.getLetters(index2);
            index=0;
        }
        plaintext = new String(plain);
        return plaintext;
    }
}

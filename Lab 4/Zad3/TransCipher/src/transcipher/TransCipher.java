/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transcipher;

/**
 *
 * @author user
 */
public class TransCipher {

    private String key_text;
    private int key;

    public TransCipher(String key_text) {
        this.key_text = key_text;
        this.key = this.key_text.length();
    }

    /**
     * Get the value of key
     *
     * @return the value of key
     */
    public int getKey() {
        return key;
    }

    /**
     * Get the value of key_text
     *
     * @return the value of key_text
     */
    public String getKey_text() {
        return key_text;
    }

    /**
     * Set the value of key_text
     *
     * @param key_text new value of key_text
     */
    public void setKey_text(String key_text) {
        this.key_text = key_text;
    }

    public String encription(String plaintext) {
        String ciphertext;
        int count = 0;
        char plain[] = plaintext.toCharArray();
        char plain2D[][];
        int cols = this.getKey();
        int rows = (plain.length) / this.getKey();
        if (((plain.length / cols) >= cols) && ((plain.length % cols) != 0)) {
            rows += 1;
        }
        char cipher[] = new char[plain.length];
        plain2D = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (count < plain.length) {
                    plain2D[i][j] = plain[count];
                    count++;
                } else {
                    plain2D[i][j] = '-';
                }
                System.out.printf("%s ", plain2D[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        count = 0;
        for (int k = 0; k < cols; k++) {
            for (int l = 0; l < rows; l++) {
                if (plain2D[l][k] != '-') {
                    cipher[count] = plain2D[l][k];
                    count++;
                }
            }
        }
        ciphertext = new String(cipher);
        return ciphertext;
    }

    public String decription(String ciphertext) {
        String plaintext;
        int count = 0;
        char cipher[] = ciphertext.toCharArray();
        char cipher2D[][];
        int rows = this.getKey();
        int cols = (cipher.length) / this.getKey();
        if (((cipher.length / rows) >= rows) && ((cipher.length % rows) != 0)) {
            cols += 1;
        }
        char plain[] = new char[cipher.length];
        cipher2D = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (count < cipher.length) {
                    cipher2D[i][j] = cipher[count];
                    count++;
                } else {
                    cipher2D[i][j] = '-';
                }
                System.out.printf("%s ", cipher2D[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        count = 0;
        for (int k = 0; k < cols; k++) {
            for (int l = 0; l < rows; l++) {
                if (cipher2D[l][k] != '-') {
                    plain[count] = cipher2D[l][k];
                    count++;
                }
            }
        }
        plaintext = new String(plain);
        return plaintext;
    }
}

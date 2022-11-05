/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module6.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hajarhanifah
 */
public class DemoInputKarakter {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.err.print("Masukkan sebuah karakter: ");
        char KarakterInput;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        KarakterInput = (char) br.read();
        System.out.println("Karakter yang dimasukkan adalah \'" + KarakterInput + "\'");
    }

}

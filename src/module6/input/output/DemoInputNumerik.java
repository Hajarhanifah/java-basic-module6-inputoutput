/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module6.input.output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hajarhanifah
 */
public class DemoInputNumerik {

    public static void main(String[] args) throws
            IOException {
        System.out.print("Masukkan sebuah bilangan bulat : ");
        String temp;
        int bilanganInput = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
            
        // input data dianggap sebagai string
        temp = br.readLine();
        try {
        
        // konversi dari string ke integer
            bilanganInput = Integer.parseInt(temp);
        } catch (NumberFormatException nfe) {
            System.out.println("Nilai yang dimasukkan "
                    + "bukan bilangan bulat");
            System.exit(1);
        }
        System.out.println("Bilangan yang anda masukkan adalah " + bilanganInput);
    }

}

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
public class DemoInputString {
    public static void main(String[] args) throws
            IOException {
        System.out.print("Masukkan nama Anda: ");
        String namaInput;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        namaInput = br.readLine();
        System.out.println("Halo " + namaInput + "...");
        System.out.println("Semoga Anda Sukses Selalu..");
    }

    
}

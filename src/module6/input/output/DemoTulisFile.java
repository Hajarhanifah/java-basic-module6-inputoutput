/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module6.input.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author hajarhanifah
 */
public class DemoTulisFile {
        public static void main(String[] args) {
        FileOutputStream foutput = null;
        String data = "Hello Guys ! \n Semoga \n Sukses selalu..";
        
        // membuka file
        try {
            foutput = new FileOutputStream("/Users/haloo/Downloads/OUTPUT.TXT");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File tidak dapat terbentuk.");
            return; // keluar dari method
        }
        
        // menulis data ke dalam file
        try {
            for (int i = 0; i < data.length(); i++) {
        
        // data akan dikonversi per karakter
                foutput.write((int) data.charAt(i));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }
        
        // menutup file
        try {
            foutput.close();
        } catch (IOException ioe) {
        }
    }

}

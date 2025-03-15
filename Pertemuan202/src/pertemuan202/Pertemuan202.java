/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan202;
import javax.swing.JOptionPane;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan202 {
    public static void main(String[] args) {
        //deklarasi variabel
        Double pi,luas;
        int r = 0;
        String nilai="";
        //deskripsi
        pi = 3.14;
        
        nilai =JOptionPane.showInputDialog("Input nilai Jari-jari:");
        r = Integer.parseInt(nilai);
        //proses
        luas = pi * r * r;
        
        //output
        System.out.println("Luas Lingkaran: "+luas);
        
    }
}

   

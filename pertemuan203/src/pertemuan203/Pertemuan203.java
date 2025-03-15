/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan203;
import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan203 {
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        //deklarasi variabel
        Double pi, luas;
        int r = 0;
        String nilai="";
        //deskripsi
        pi = 3.14;
        
        System.out.println("Hitung Luas Lingkaran");
        System.out.println("Input nilai Jari-jari:");
        nilai = dtain.nextLine();
        r = Integer.parseInt(nilai);
        //proses
        luas = pi * r * r;
        
        //output
        System.out.println("Luas Lingkaran: "+luas);
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan201;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Eufemia Kristiani Sanratu Nirmala
 * TGL: 15 Maret 2025
 */
public class Pertemuan201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String mhs = "Bratha Deratu";
         String nim = "2301010371";
         
         BufferedReader dtin = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Membaca input keyboard");
         try{
             System.out.print("input Nama: ");
              mhs = dtin.readLine();
             System.out.print("input Nim: ");
             nim = dtin.readLine();
             
         }catch(IOException e){
              System.out.println("Terjadi error");
         }
         
         System.out.printf("Mahasiswa dengan nama %s memiliki NIM %s",mhs,nim);
         
    }
    
}

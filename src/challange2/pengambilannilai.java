/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challange2;

import java.util.Scanner;
       
/**
 *
 * @author USER
 */
public class pengambilannilai {
    
    public static void main(String[] args) {
        
        //deklarasi
        int nilai;
        int total;
        
        //scanner
        Scanner gomeng = new Scanner(System.in);
        
        //input nilai
        System.out.println("silahkan masukkan nilai:");
        int Nilai = gomeng.nextInt();
        
        //penggolongan
        if(Nilai <=40) {
            System.out.println("nilai anda masuk dalam kategori");
            System.out.println("F");
        } else if (Nilai <=55) {
            System.out.println("E");
            System.out.println("nilai anda masuk dalam kategori");
        } else if (Nilai <=74) {
            System.out.println("nilai anda masuk dalam kategori");
            System.out.println("D");
        } else if (Nilai <= 85) {
            System.out.println("nilai anda masuk dalam kategori");
            System.out.println("C");
        } else if (Nilai <= 92) {
            System.out.println("nilai anda masuk dalam kategori");
            System.out.println("B");
        } else if (Nilai <= 100) {
            System.out.println("nilai anda masuk dalam kategori");
            System.out.println("A");
        } else
            System.out.println("maaf nilai yang anda masukkan salah");
        
    }
    
}

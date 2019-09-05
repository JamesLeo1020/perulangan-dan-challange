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
public class Challange2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner cimeng = new Scanner(System.in);
        double nilaiAkhir;
        double nilaiTugasharian;
        double nilaiLaporan;
        double nilaiUjian;
        
       
        System.out.println("===NILAI AKHIR SISWA===");
        System.out.print("nilai tugas :");
        double nilaitugas = cimeng.nextDouble();
        nilaiTugasharian = nilaitugas * 0.3;
        System.out.println("Nilai Tugas Harian :" + nilaiTugasharian);
        System.out.print("nilai laporan :");
        double nilailaporan = cimeng.nextDouble();
        nilaiLaporan = nilailaporan * 0.2;
        System.out.println("Nilai Laporan :" + nilaiLaporan);
        System.out.print("nilai ujian :");
        double nilaiujian = cimeng.nextDouble();
        nilaiUjian = nilaiujian * 0.5;
        System.out.println("Nilai Ujian :" + nilaiUjian);
        nilaiAkhir = nilaiTugasharian + nilaiLaporan + nilaiUjian;
        System.out.println("Nilai Akhir :" + nilaiAkhir);
        
        
        if(nilaiAkhir <= 40){
            System.out.println("F");
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
                    
        }else if(nilaiAkhir > 40 && nilaiAkhir <= 55){
            System.out.println("E");
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
            
        }else if(nilaiAkhir < 55 && nilaiAkhir <= 74){
            System.out.println("D");
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
            
        }else if(nilaiAkhir > 74 && nilaiAkhir <= 85){
            System.out.println("C");
            System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
            
        }else if(nilaiAkhir > 85 && nilaiAkhir <= 92){
            System.out.println("B");
            System.out.println("Anda lulus dengan baik, pertahankan");
            
        }else if(nilaiAkhir > 92 && nilaiAkhir <= 100){
            System.out.println("A");
            System.out.println("Anda lulus dengan sangat baik, pertahankan");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10.pkg10119913.muhammadalvinrizqiramadhan.no1;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF 10K
 * NIM : 10119913
 * Deskripsi : UTS no 1
 */
public class UTSIF1010119913MuhammadAlvinRizqiRamadhanNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int tahunLahir, tahunSekarang;

        tahunSekarang = Year.now().getValue();
        Age age = new Age(tahunSekarang);

        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(scn.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    }
    
}

package com.BoJ;

import java.util.*;

public class BOJ5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=====Konversi Satuan=====");
        System.out.println("1. Lusin");
        System.out.println("2. Gross");
        System.out.println("3. Kodi");
        System.out.println("4. Rim");
        System.out.print("Pilih jenis satuan 1-4: ");
        int pilih = scan.nextInt();
        System.out.println("");

        int lusin = 12, gross = 144, kodi = 20, rim = 500, jml, hasil;

        switch (pilih) {

            case 1:
                System.out.println("Masukkan banyak jumlah: ");
                jml = scan.nextInt();
                System.out.println("=====Hasil=====");
                hasil = jml * lusin;
                System.out.println(jml + " Lusin adalah " + hasil + " buah");
                break;

            case 2:
                System.out.println("Masukkan banyak jumlah: ");
                jml = scan.nextInt();
                System.out.println("=====Hasil=====");
                hasil = jml * lusin;
                System.out.println(jml + " gross adalah " + hasil + " lusin");
                hasil = jml * gross;
                System.out.println(jml + " gross adalah " + hasil + " buah");
                break;

            case 3:
                System.out.println("Masukkan banyak jumlah: ");
                jml = scan.nextInt();
                System.out.println("=====Hasil=====");
                hasil = jml * kodi;
                System.out.println(jml + " kodi adalah " + hasil + " buah");
                break;

            case 4:
                System.out.println("Masukkan banyak jumlah: ");
                jml = scan.nextInt();
                System.out.println("=====Hasil=====");
                hasil = jml * rim;
                System.out.println(jml + " rim adalah " + hasil + " buah");
                break;
        }

    }

}

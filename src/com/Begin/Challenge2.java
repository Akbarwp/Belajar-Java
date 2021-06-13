package com.Begin;

import java.io.*;

public class Challenge2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=====Kreasi Segitiga dan Piramida dari Bintang=====");
        System.out.println("1. Segitiga Siku-Siku");
        System.out.println("2. Piramida");
        System.out.println("3. Exit");
        System.out.print("Masukkan pilhan: ");

        int angka;
        angka = Integer.parseInt(br.readLine());

        switch (angka) {

            case 1:
                int baris1;
                System.out.print("Masukkan jumlah baris = ");

                baris1 = Integer.parseInt(br.readLine());
                for (int x = 1; x <= baris1; x++) {

                    for (int y = 1; y <= x; y++) {

                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                int baris2;
                System.out.print("Masukkan jumlah baris = ");

                baris2 = Integer.parseInt(br.readLine());
                for (int a = 1; a <= baris2; a++) {

                    for (int b = baris2; b >= a; b--) {

                        System.out.print(" ");
                    }
                    for (int c = 1; c <= a; c++) {

                        System.out.print("*");
                    }
                    for (int d = 1; d <= a - 1; d++) {

                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;

            default:
                System.out.println("Terima Kasih");
        }
    }
}

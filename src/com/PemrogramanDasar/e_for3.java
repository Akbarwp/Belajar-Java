package com.PemrogramanDasar;

import java.util.Scanner;

public class e_for3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasil;
        hasil = 0;
        System.out.print("Masukkan x = ");

        for (int x = input.nextInt(); x < 10; x++) {

            System.out.println(x);
            hasil += x;
        }

        System.out.println("Hasil penjumlahan = " + hasil);

        System.out.print("Masukkan y = ");
        hasil = 1;
        for (int y = input.nextInt(); y < 10; y += 2) {

            System.out.println(y);
            hasil *= y;
        }

        System.out.println("Hasil perkalian = " + hasil);
    }
}

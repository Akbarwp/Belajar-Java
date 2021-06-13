package com.PemrogramanDasar;

import java.util.*;

public class i_MethodLatihan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Panjang = ");
        int panjang = scan.nextInt();
        System.out.print("Lebar = ");
        int lebar = scan.nextInt();

        Tampil(panjang, lebar);

    }

    private static void Tampil(int panjang, int lebar) {

        System.out.println("Gambar = ");
        gambar(panjang, lebar);
        System.out.println("Luasnya = " + luas(panjang, lebar));
        System.out.println("Kelilingnya = " + keliling(panjang, lebar));
    }

    private static void gambar(int panjang, int lebar) {

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {

                System.out.print("* ");
            }

            System.out.println("");
        }
    }

    private static int luas(int panjang, int lebar) {

        int hasil;

        hasil = panjang * lebar;

        return hasil;
    }

    private static int keliling(int panjang, int lebar) {

        int hasil;

        hasil = (panjang + lebar) * 2;

        return hasil;
    }
}

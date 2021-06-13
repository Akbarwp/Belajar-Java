package com.PemrogramanDasar;

public class i_Method {

    public static void main(String[] args) {

        int x, y;
        x = 10;

        y = hitung(x);

        System.out.println("x = " + x + " y = " + y);

    }

    // Fungsi atau Method menggunakan kembalian
    private static int hitung(int input) {

        int hasil;
        hasil = (input + 2) * input;

        return hasil;
    }
}

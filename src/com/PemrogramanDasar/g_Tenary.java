package com.PemrogramanDasar;

import java.util.*;

public class g_Tenary {

    public static void main(String[] args) {

        // Tenary Operator
        // variable x = (ekspresi) ? (True statement) : (False statement);

        Scanner scan = new Scanner(System.in);

        int input, x;

        System.out.print("Masukkan angka = ");
        input = scan.nextInt();

        x = (input == 10) ? (input * input) : (input / 2);

        System.out.print("Hasil = " + x);
    }
}

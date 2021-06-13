package com.PemrogramanDasar;

import java.util.Scanner;

public class f_do {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan nilai x = ");
        int z = Input.nextInt();

        do {
            System.out.println(z);
            z++;
        } while (z < 10);
    }
}

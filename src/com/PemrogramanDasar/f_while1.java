package com.PemrogramanDasar;

import java.util.Scanner;

public class f_while1 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Masukkan nilai x = ");
        int x = Input.nextInt();

        System.out.println("Masukkan nilai y = ");
        int y = Input.nextInt();

        System.out.println();

        while (x <= y) {

            System.out.println("Nilai x = " + x);
            x += 2;

        }
    }
}

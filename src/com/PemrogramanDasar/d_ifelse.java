package com.PemrogramanDasar;

import java.util.Scanner;

public class d_ifelse {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Masukkan angka = ");
        int x = Input.nextInt();

        if (x % 2 == 0) {

            System.out.println("Angka Genap");
        }

        else {

            System.out.println("Angka Ganjil");
        }
    }

}

package com.PemrogramanDasar;

import java.util.*;

public class e_for2 {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("=====Angka Prima=====");

        System.out.print("Masukkan nilai f = ");

        for (int f = Input.nextInt(); f <= 20; f++) {

            int angka = 0;

            for (int g = 1; g <= f; g++) {

                if (f % g == 0) {

                    angka += 1;
                }
            }

            if (angka == 2) {

                System.out.print(f + " ");
            }
        }
    }
}

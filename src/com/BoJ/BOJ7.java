package com.BoJ;

import java.util.*;

public class BOJ7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int banyak;

        System.out.print("Masukkan banyak makanan/minuman favorit Anda: ");
        banyak = scan.nextInt();
        String[] mm = new String[banyak];
        System.out.println("");

        for (int i = 0; i < banyak; i++) {

            System.out.print("Masukkan banyak makanan/minuman ke-" + (i + 1) + " : ");
            mm[i] = scan.next();
        }

        System.out.println("Masukkan banyak makanan/minuman: ");
        for (int i = 0; i < banyak; i++) {

            if ((i + 1) < banyak) {

                System.out.print(mm[i] + ", ");
            } else {

                System.out.print(mm[i] + " ");
            }

        }

    }
}

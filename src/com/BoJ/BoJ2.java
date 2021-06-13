package com.BoJ;

import java.util.*;

public class BoJ2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kelipatan: ");
        int kel = scan.nextInt();
        System.out.print("Masukkan batasan: ");
        int bat = scan.nextInt();
        System.out.print("Hasil: ");

        for (int i = kel; i <= bat; i += kel) {

            if ((i + kel) < bat) {

                System.out.print(i + ", ");
            } else {

                System.out.print(i + " ");
            }

        }

    }
}

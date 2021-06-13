package com.PemrogramanDasar;

public class e_NestedFor {

    public static void main(String[] args) {

        System.out.println("=====Segitiga Plus=====");

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("=====Segitiga Minus 1=====");

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("=====Segitiga Minus 2=====");
        for (int i = 10; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {

                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("=====Segitiga Piramida=====");

        for (int a = 1; a <= 10; a++) {

            for (int b = 10; b >= a; b--) {

                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {

                System.out.print("*");
            }
            for (int d = 1; d <= a - 1; d++) {

                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("");

        System.out.println("=====Segitiga Gabung=====");

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {

                if (i == j) {

                    break;
                } else if ((i + j) == 9) {

                    break;
                }
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("=====Segitiga Wajik=====");

        int a = 10;
        int b = 5;
        for (int i = 0; i < 10; i++) {
            for (int c = 10; c > i; c--) {
                System.out.print(" ");
            }
            for (int d = 0; d < i; d++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int j = 0; j < 10; j++) {
            for (int c = 0; c < j; c++) {
                System.out.print(" ");
            }
            for (int d = 10; d > j; d--) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("=====Jajargenjang=====");

        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < 15; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("=====Segitiga Balik=====");

        int k = 0;
        int l = 10;
        for (int i = 0; i < 10; i++) {
            for (int s = 0; s < l; s++) {
                System.out.print("  ");
            }
            for (int d = 0; d < k; d++) {
                System.out.print(" *");
            }
            System.out.println("");
            k = k + 1;
            l = l - 1;
        }

        System.out.println("");

        System.out.println("=====Segitiga Kebalik=====");

        int e = 0;
        for (int z = 0; z < 10; z++) {
            for (int y = 0; y < e; y++) {
                System.out.print("  ");
            }
            for (int c = 10; c > e; c--) {
                System.out.print(" *");
            }
            System.out.println("");
            e = e + 1;
        }

        System.out.println("");

    }

}

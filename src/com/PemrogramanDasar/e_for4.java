package com.PemrogramanDasar;

public class e_for4 {

    public static void main(String[] args) {

        int f_n, f_n1, f_n2;

        System.out.println("=====Baris Fibonacci=====");

        f_n = 1;
        f_n1 = 1;
        f_n2 = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Baris ke " + i + " yaitu = " + f_n);
            f_n = f_n1 + f_n2;

            f_n2 = f_n1;
            f_n1 = f_n;

        }

    }
}

package com.Proyek;

import java.util.*;

public class KalkulatorSederhana {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float x, y, hasil;
        char operator;

        System.out.print("Nilai x = ");
        x = scan.nextInt();
        System.out.print("Operator = ");
        operator = scan.next().charAt(0);
        System.out.print("Nilai y = ");
        y = scan.nextInt();

        System.out.print(x + " " + operator + " " + y);
        System.out.println("");

        if (operator == '+') {

            // Penjumlahan
            hasil = x + y;
            System.out.print("Hasil = " + hasil);

        }

        else if (operator == '-') {

            // Pengurangan
            hasil = x - y;
            System.out.print("Hasil = " + hasil);

        }

        else if (operator == '*') {

            // Perkalian
            hasil = x * y;
            System.out.print("Hasil = " + hasil);

        }

        else if (operator == '/') {

            // Pembagian
            hasil = x / y;
            System.out.print("Hasil = " + hasil);

        }

        else if (operator == '%') {

            // Modulus
            hasil = x % y;
            System.out.print("Hasil = " + hasil);

        }

        else {

            // Tidak ada operator

            System.out.println("Operator salah");
        }

    }
}

package com.PemrogramanDasar;

import java.lang.String;

public class i_MethodRekursifBercabang {

    public static void main(String[] args) {

        int NilaiFibonacci = fibonacci(5, "atas");
        System.out.println("Fibonacci ke - 5 adalah " + NilaiFibonacci);
    }

    private static int fibonacci(int n, String daun) {

        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0) {
            return n;

        } else {

            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}

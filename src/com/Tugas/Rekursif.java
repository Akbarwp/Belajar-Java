package com.Tugas;

import java.io.*;

public class Rekursif {

    // P(n, r) = n!/(n-r)!
    // C(n, r) = n!/(r! (n – r)!)

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nilai n: ");
        int n = Integer.parseInt(scan.readLine());
        System.out.print("Nilai r: ");
        int r = Integer.parseInt(scan.readLine());

        int mutasi = permutasi(n) / permutasi2(n, r);

        System.out.println("Hasil Permutasi: " + n + "! / (" + n + " - " + r + ")! = " + mutasi);

        int kombinasi = permutasi(n) / (kombi(r) * permutasi2(n, r));

        System.out.println("Hasil Kombinasi: " + n + "! / (" + r + "! (" + n + " - " + r + "))! = " + kombinasi);

    }

    private static int permutasi(int n) {

        if (n == 1) {

            return 1;

        } else {

            return n * permutasi(n - 1);
        }
    }

    private static int permutasi2(int n, int r) {

        int x = n - r;

        if (x == 1) {

            return 1;

        } else {

            return x * permutasi(x - 1);
        }
    }

    private static int kombi(int r) {

        if (r == 1) {

            return 1;

        } else {

            return r * permutasi(r - 1);
        }
    }
}

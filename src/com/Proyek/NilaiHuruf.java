package com.Proyek;

import java.io.*;

public class NilaiHuruf {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String h = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] hu = h.toCharArray();
        int[][] nilai = new int[30][30];
        int n = 1;

        for (int j = 0; j < 26; j++) {

            hu[j] = h.charAt(j);
            nilai[0][j] = n;
            n++;
        }

        for (int a = 0; a < 26; a++) {

            System.out.println("Huruf " + hu[a] + " bernilai: " + nilai[0][a]);
        }

        System.out.println();

        String input, huruf2;
        int pj;

        System.out.print("Masukkan Nama Anda: ");
        input = br.readLine();
        huruf2 = input.toUpperCase();
        char[] arrHuruf = huruf2.toCharArray();
        pj = arrHuruf.length;

        for (int i = 0; i < pj; i++) {

            for (int k = 0; k < 26; k++) {

                if (arrHuruf[i] == hu[k]) {

                    nilai[1][i] = nilai[0][k];
                }
            }
        }

        System.out.println("Kata: " + huruf2);
        System.out.println("Banyak huruf: " + pj);

        for (int j = 0; j < pj; j++) {

            System.out.println("Huruf " + arrHuruf[j] + " urutan: " + (j + 1) + " bernilai: " + nilai[1][j]);
        }

    }
}

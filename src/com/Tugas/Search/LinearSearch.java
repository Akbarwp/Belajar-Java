package com.Tugas.Search;

import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {

        // Data ada 15 = 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

        Scanner scan = new Scanner(System.in);

        int[] data = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53 };
        int cari, lokasi = 0;

        System.out.print("Masukkan data yang dicari: ");
        cari = scan.nextInt();

        for (int i = 0; i < data.length; i++) {

            if (data[i] == cari) {

                lokasi = i + 1;
                break;

            } else {
                lokasi = 0;
            }
        }

        if (lokasi != 0) {

            System.out.println("Data ditemukan pada baris ke-" + lokasi);
        } else {

            System.out.println("Data tidak ditemukan");
        }

        System.out.print("Data: {");
        for (int j = 0; j < data.length; j++) {

            System.out.print(data[j] + ", ");
        }

        System.out.println("}");
    }
}

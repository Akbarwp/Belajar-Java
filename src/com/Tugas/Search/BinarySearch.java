package com.Tugas.Search;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        // Data ada 15 = 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

        Scanner scan = new Scanner(System.in);

        int[] data = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
        int cari, lokasi = -1;

        System.out.print("Masukkan data yang dicari: ");
        cari = scan.nextInt();
        lokasi = binarySearch(data, 0, 14, cari);

        if (lokasi != -1) {

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

    public static int binarySearch(int[] data, int beg, int end, int cari) {

        int mid;
        if (end >= beg) {

            mid = (beg + end) / 2;
            if (data[mid] == cari) {

                return mid + 1;
            } else if (data[mid] < cari) {

                return binarySearch(data, mid + 1, end, cari);
            } else {

                return binarySearch(data, beg, mid - 1, cari);
            }
        }
        return -1;
    }
}

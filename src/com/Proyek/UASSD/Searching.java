package com.Proyek.UASSD;

import java.util.*; // import untuk dapat menggunakan Scanner

public class Searching {

    public static void main(String[] args) {

        // Data ada 15 = 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

        Scanner scan = new Scanner(System.in); // Deklarasi Scanner

        // Deklarasi array beserta isinya
        int[] data = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
        System.out.print("Data: {");
        // Looping for untuk menampilkan isi dari array
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j] + ", ");
        }
        System.out.println("}");

        // Deklarasi int cari untuk angka yang akan dicari
        int cari = -1;
        // Deklarasi int lokasi untuk lokasi atau index angka yang dicari
        int lokasi = -1;

        // Meninputkan angka yang akan dicari
        System.out.print("Masukkan data yang dicari: ");
        cari = scan.nextInt();
        // Menjalankan lokasi dengan memanggil fungsi binariSearch()
        lokasi = binarySearch(data, 0, 14, cari);

        // If else untuk mengetahui apakah angka yang dicari ditemukan atau tidak
        if (lokasi != -1) {
            System.out.println("Data ditemukan pada baris ke-" + lokasi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    // Deklarasi int beg, end untuk membantu dalam melakukan searching.
    // Dan Deklarasi int[] data, cari untuk menyalurkan dari prosedur main
    public static int binarySearch(int[] data, int beg, int end, int cari) {

        // Deklarasi int mid untuk membantu dalam melakukan searching
        int mid;

        // If untuk memberi kondisi bila int end lebih dari sama dengan int beg
        if (end >= beg) {

            // Membuat rumus untuk mid
            mid = (beg + end) / 2;

            // If untuk memberi kondisi bila isi data array dengan index ke-mid sama dengan
            // cari
            if (data[mid] == cari) {

                // Maka akan melakukan return nilai mid ditambah 1
                return mid + 1;

                // Else if untuk memberi kondisi bila isi data array dengan index ke-mid kurang
                // dari angka yang dicari
            } else if (data[mid] < cari) {

                // Maka akan mengulangi fungsi binarySearch() dengan nilai mid ditambah 1
                return binarySearch(data, mid + 1, end, cari);

                // Else if untuk memberi kondisi bila isi data array dengan index ke-mid lebih
                // dari angka yang dicari
            } else {

                // Maka akan mengulangi fungsi binarySearch() dengan nilai mid dikurangi 1
                return binarySearch(data, beg, mid - 1, cari);
            }
        }
        return -1;
    }
}

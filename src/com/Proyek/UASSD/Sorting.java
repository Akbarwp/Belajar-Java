package com.Proyek.UASSD;

// import untuk dapat menggunakan Scanner
import java.util.*;

public class Sorting {

    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        // Deklarasi array beserta isinya dengan urutan yang acak
        int arr[] = { 54, 40, 15, 62, 37, 68, 75, 90, 12, 1 };

        // Menampilkan array sebelum melakukan sorting
        System.out.println("Array Sebelum Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Membuat menu
        System.out.println("1. Urutkan dari terkecil");
        System.out.println("2. Urutkan dari terbesar");
        System.out.println("Masukkan pilihan menu: ");
        int pilih = scan.nextInt();

        // Implementasi menu dengan switch case
        switch (pilih) {

            // sorting Ascending
            case 1:
                // Memanggil prosedur bubbleSort() untuk melakukan sorting
                bubbleSort1(arr);
                // Menampilkan array setelah melakukan sorting
                System.out.println("Array Setelah Bubble Sort");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            // sorting Descending
            case 2:
                // Memanggil prosedur bubbleSort() untuk melakukan sorting
                bubbleSort2(arr);
                // Menampilkan array setelah melakukan sorting
                System.out.println("Array Setelah Bubble Sort");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
        }
    }

    // Deklarasi fungsi bubbleSort() untuk melakukan sorting Ascending
    private static int bubbleSort1(int[] arr) {

        // Deklarasi int n sebagai panjang dari array
        int n = arr.length;
        // Deklarasi int temp untuk membantu dalam melakukan sorting
        int temp = 0;

        // Looping untuk melakukan bubblesort
        for (int i = 0; i < n; i++) {

            // Looping untuk melakukan bubblesort
            for (int j = 1; j < (n - i); j++) {

                // If untuk memberi kondisi bila nilai kiri lebih dari nilai kanan
                if (arr[j - 1] > arr[j]) {

                    // penukaran elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return 0;
    }

    // Deklarasi fungsi bubbleSort() untuk melakukan sorting Descending
    private static int bubbleSort2(int[] arr) {

        // Deklarasi int n sebagai panjang dari array
        int n = arr.length;
        // Deklarasi int temp untuk membantu dalam melakukan sorting
        int temp = 0;

        // Looping untuk melakukan bubblesort
        for (int i = 0; i < n; i++) {

            // Looping untuk melakukan bubblesort
            for (int j = 1; j < (n - i); j++) {

                // If untuk memberi kondisi bila nilai kiri kurang dari nilai kanan
                if (arr[j - 1] < arr[j]) {

                    // penukaran elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return 0;
    }
}

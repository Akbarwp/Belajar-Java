package com.Tugas.Search;

import java.util.*;

public class InterpolationSearch {

    public static void main(String[] args) {

        // Panjang Array = banyak huruf pada nama lengkap = 16

        Scanner scan = new Scanner(System.in);

        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53 };

        int n = arr.length;

        System.out.print("Masukkan angka yang akan dicari: ");
        int x = scan.nextInt();
        int index = interpolationSearch(arr, 0, n - 1, x);

        if (index != -1) {

            System.out.println("Angka ditemukan pada index ke " + index);

        } else {

            System.out.println("Angka tidak ditemukan");
        }
    }

    public static int interpolationSearch(int arr[], int lo, int hi, int x) {

        int pos;

        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));

            if (arr[pos] == x) {
                return pos;
            }

            else if (arr[pos] < x) {
                return interpolationSearch(arr, pos + 1, hi, x);
            }

            else if (arr[pos] > x) {
                return interpolationSearch(arr, lo, pos - 1, x);
            }
        }
        return -1;
    }

}

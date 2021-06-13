package com.PemrogramanDasar;

public class j_Array {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int ganjil = 0;
        int genap = 0;

        for (int numb : numbers) {

            if (numb % 2 == 0) {

                genap += numb;

            } else {

                ganjil += numb;
            }
        }

        System.out.println("Penjumlah bilangan genap yaitu " + genap);
        System.out.println("Penjumlah bilangan ganjil yaitu " + ganjil);
    }

}

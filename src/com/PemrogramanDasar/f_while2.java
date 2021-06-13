package com.PemrogramanDasar;

public class f_while2 {

    public static void main(String[] args) {

        int x = 1, y = 10, total = 0;

        while (x <= y) {

            total += x;
            System.out.println("ditambah " + x + " menjadi " + total);
            x++;
        }
    }
}

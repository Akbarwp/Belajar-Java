package com.PemrogramanDasar;

public class h_BCR {

    public static void main(String[] args) {

        // break, continue, return

        int x = 0;

        while (true) {

            x++;

            if (x == 10) {

                break;
                // Memaksa untuk keluar dari looping
            } else if (x == 5) {

                continue;
                // Memaksa untuk memulai aksi dari awal
            } else if (x == 7) {

                return;
                // Memaksa untuk keluar dari program
            }

            System.out.println("looping ke - " + x);
        }

        System.out.println("Akhir dari looping");
    }
}
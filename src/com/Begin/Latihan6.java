package com.Begin;

import java.io.*;

public class Latihan6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Silahkan pesan makanan");
        String namaMakanan = br.readLine();

        switch (namaMakanan) {

            case "Bakso":
                System.out.println("Harganya Rp10.000");
                break;

            case "Sate":
                System.out.println("Harganya Rp11.000");
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}

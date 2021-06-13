package com.Begin;

import java.io.*;

public class Latihan4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        System.out.println("Masukkan nama Anda = ");
        nama = br.readLine();

        if (nama.equals("Akbar")) {

            System.out.println("Nama Anda telah tercatat");
        }
    }
}
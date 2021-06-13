package com.PemrogramanDasar;

import java.io.*;

public class a_BufferedReader2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        try {
            System.out.print("Masukkan nama Anda = ");
            nama = br.readLine();

            System.out.println("Angka yang Anda masukkan yaitu = " + nama);

        } catch (Exception e) {
        }
    }
}

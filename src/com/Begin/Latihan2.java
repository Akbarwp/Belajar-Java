package com.Begin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan2 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String nama;

        try {
            System.out.print("Masukkan nama Anda = ");
            nama = br.readLine();

            System.out.println("Angka yang Anda masukkan yaitu = " + nama);

        } catch (Exception e) {
        }
    }
}
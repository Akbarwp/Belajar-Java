package com.PemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_BufferedReader {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Masukkan angka = ");
            int Angka = Integer.parseInt(br.readLine());

            System.out.println("Angka yang Anda masukkan yaitu = " + Angka);

        } catch (Exception e) {
        }
    }
}

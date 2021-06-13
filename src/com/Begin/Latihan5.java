package com.Begin;

import java.io.*;

public class Latihan5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x;
        x = Integer.parseInt(br.readLine());
        if (x % 2 == 0) {

            System.out.println("Anda memasukkan angka genap");
        } else if (x % 2 == 1) {

            System.out.println("Anda memasukkan angka ganjil");
        } else {

            System.out.println("Anda tidak memasukkan angka");
        }
    }
}

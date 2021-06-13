package com.Begin;

import java.io.*;

public class Challenge1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        int berat, tinggi;
        double BMI, tinggi2;

        System.out.println("Masukkan nama = ");
        nama = br.readLine();
        System.out.println("Masukkan berat badan = ");
        berat = Integer.parseInt(br.readLine());
        System.out.println("Masukkan tinggi badan = ");
        tinggi = Integer.parseInt(br.readLine());

        tinggi2 = (Double.valueOf(tinggi) / 100);
        BMI = berat / (tinggi2 * tinggi2);

        System.out.println("Nama = " + nama);
        System.out.println("Berat = " + berat);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("BMI = " + BMI);

        if (BMI >= 30) {

            System.out.println("Anda Sekarang Sedang Mengidap Obesitas");

        } else if ((BMI < 30) && (BMI >= 23)) {

            System.out.println("Anda Memiliki Gejala Obesitas");

        } else if ((BMI < 23) && (BMI >= 18.5)) {

            System.out.println("Berat Badan Anda Normal");

        } else if (BMI < 18.5) {

            System.out.println("Berat Badang Anda Kurang");

        } else {

            System.out.println("Coba masukkan data yang benar");
        }

    }
}

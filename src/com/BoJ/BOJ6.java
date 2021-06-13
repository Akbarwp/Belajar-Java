package com.BoJ;

import java.io.*;

public class BOJ6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jur, kel, umur, total = 0;
        int jur1 = 0;
        int pilih;
        char gender;
        String nama, alamat, KTP, jenis;
        String jurusan = "", jurusan1, jurusan2, jurusan3, jurusan4;
        jurusan1 = "Jakarta - Surabaya";
        jurusan2 = "Surabaya - Medan";
        jurusan3 = "Surabaya - Bali";
        jurusan4 = "Jakarta - Bali";
        int hrg, eko1, eko2, eko3, eko4;
        eko1 = 1000000;
        eko2 = 700000;
        eko3 = 500000;
        eko4 = 1500000;
        int bis1, bis2, bis3, bis4;
        bis1 = 1500000;
        bis2 = 1200000;
        bis3 = 1000000;
        bis4 = 2000000;

        System.out.println("=====Identitas Diri=====");
        System.out.print("Masukkan Nama Anda: ");
        nama = br.readLine();
        System.out.print("Masukkan Alamat Anda: ");
        alamat = br.readLine();
        System.out.print("Masukkan Nomor KTP Anda: ");
        KTP = br.readLine();
        System.out.print("Masukkan Jenis Kelamin Anda (L/P): ");
        jenis = br.readLine();
        gender = jenis.charAt(0);
        System.out.print("Masukkan Umur Anda: ");
        umur = Integer.parseInt(br.readLine());
        System.out.println("");

        do {

            System.out.println("=====Menu=====");
            System.out.println("1. Jurusan Penerbangan");
            System.out.println("2. Jenis Kelas Tiket Penerbangan");
            System.out.println("3. Nota");
            System.out.println("4. Exit");
            System.out.print("Masukkan nomor pilihan: ");
            pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {

                case 1:

                    System.out.println("=====Jurusan Penerbangan=====");
                    System.out.println("1. Jakarta - Surabaya");
                    System.out.println("2. Surabaya - Medan");
                    System.out.println("3. Surabaya - Bali");
                    System.out.println("4. Jakarta - Bali");
                    System.out.print("Silakan pilih nomor jurusan penerbangan: ");
                    jur = Integer.parseInt(br.readLine());
                    jur1 = jur;
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("=====Jurusan Penerbangan=====");
                    if (jur1 == 1) {

                        System.out.println(jurusan1);
                        jurusan = jurusan1;
                        System.out.println("=====Kelas Penerbangan=====");
                        System.out.println("1. Ekonomi           (Rp1.000.000)");
                        System.out.println("2. Bisnis            (Rp1.500.000)");
                        System.out.print("Silakan pilih nomor kelas penerbangan: ");
                        kel = Integer.parseInt(br.readLine());
                        if (kel == 1) {
                            if (umur >= 0 && umur <= 5) {

                                total = eko1 - (eko1 * 30 / 100);
                            } else {

                                total = eko1;
                            }
                        } else if (kel == 2) {
                            if (umur >= 0 && umur <= 5) {

                                total = bis1 - (bis1 * 30 / 100);
                            } else {

                                total = bis1;
                            }
                        }
                    } else if (jur1 == 2) {

                        System.out.println(jurusan2);
                        jurusan = jurusan2;
                        System.out.println("=====Kelas Penerbangan=====");
                        System.out.println("1. Ekonomi           (Rp700.000)");
                        System.out.println("2. Bisnis            (Rp1.200.000)");
                        System.out.print("Silakan pilih nomor kelas penerbangan: ");
                        kel = Integer.parseInt(br.readLine());
                        if (kel == 1) {
                            if (umur >= 0 && umur <= 5) {

                                total = eko2 - (eko2 * 30 / 100);
                            } else {

                                total = eko2;
                            }
                        } else if (kel == 2) {
                            if (umur >= 0 && umur <= 5) {

                                total = bis2 - (bis2 * 30 / 100);
                            } else {

                                total = bis2;
                            }
                        }
                    } else if (jur1 == 3) {

                        System.out.println(jurusan3);
                        jurusan = jurusan3;
                        System.out.println("=====Kelas Penerbangan=====");
                        System.out.println("1. Ekonomi           (Rp500.000)");
                        System.out.println("2. Bisnis            (Rp1.000.000)");
                        System.out.print("Silakan pilih nomor kelas penerbangan: ");
                        kel = Integer.parseInt(br.readLine());
                        if (kel == 1) {
                            if (umur >= 0 && umur <= 5) {

                                total = eko3 - (eko3 * 30 / 100);
                            } else {

                                total = eko3;
                            }
                        } else if (kel == 2) {
                            if (umur >= 0 && umur <= 5) {

                                total = bis3 - (bis3 * 30 / 100);
                            } else {

                                total = bis3;
                            }
                        }
                    } else if (jur1 == 4) {

                        System.out.println(jurusan4);
                        jurusan = jurusan4;
                        System.out.println("=====Kelas Penerbangan=====");
                        System.out.println("1. Ekonomi           (Rp1.500.000)");
                        System.out.println("2. Bisnis            (Rp2.000.000)");
                        System.out.print("Silakan pilih nomor kelas penerbangan: ");
                        kel = Integer.parseInt(br.readLine());
                        if (kel == 1) {
                            if (umur >= 0 && umur <= 5) {

                                total = eko4 - (eko4 * 30 / 100);
                            } else {

                                total = eko4;
                            }
                        } else if (kel == 2) {
                            if (umur >= 0 && umur <= 5) {

                                total = bis4 - (bis4 * 30 / 100);
                            } else {

                                total = bis4;
                            }
                        }
                    }
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("=====Tiket Penerbangan=====");
                    System.out.println("Nama: " + nama);
                    System.out.println("Alamat: " + alamat);
                    System.out.println("Nomor KTP: " + KTP);
                    System.out.println("Jenis Kelamin: " + gender);
                    System.out.println("Umur: " + umur + " tahun");
                    System.out.println("Jurusan: " + jurusan);
                    System.out.println("Total Harga: Rp" + total);
                    System.out.println("============================");
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
                    break;
            }

        } while (pilih != 4);

    }
}

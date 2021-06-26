package com.Proyek;

import java.util.*;
import java.io.*;

public class UASPD {

    public static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    public static Vector<String> IDPel = new Vector();
    public static Vector<String> nmPel = new Vector();
    public static Vector<String> almt = new Vector();
    public static Vector<String> telp = new Vector();

    public static Vector<String> IDBran = new Vector();
    public static Vector<String> nmBran = new Vector();
    public static Vector<String> lokasi = new Vector();
    public static Vector<String> tglSimpan = new Vector();

    public static Vector<String> IDPerhi = new Vector();
    public static Vector<String> jenPerhi = new Vector();
    public static Vector<String> bahPerhi = new Vector();
    public static Vector<Integer> berPerhi = new Vector();
    public static Vector<Integer> totPerhi = new Vector();
    public static Vector<Integer> lama = new Vector();
    public static Vector<Integer> totAwal = new Vector();
    public static Vector<Integer> diskon = new Vector();
    public static Vector<Integer> diskonRp = new Vector();
    public static Vector<Integer> totAkhir = new Vector();

    public static Vector<String> IDPera = new Vector();
    public static Vector<String> jenPera = new Vector();

    public static Vector<Integer> totAkhTran = new Vector();
    public static Vector<Integer> bayar = new Vector();
    public static Vector<Integer> kembalian = new Vector();

    public static int pilih;

    public static void main(String[] args) throws IOException {

        while (true) {

            Menu();

            switch (pilih) {

                case 1:

                    n1();

                    switch (pilih) {

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 2:

                    n1();

                    switch (pilih) {

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 3:

                    n1();

                    switch (pilih) {

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 4:

                    n1();

                    switch (pilih) {

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 5:

                    n1();

                    switch (pilih) {

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 6:

                    n1();

                    switch (pilih) {

                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 7:
                    break;

                case 8:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void Menu() throws IOException {

        System.out.println("=====Menu=====");
        System.out.println("1. Data Pelanggan");
        System.out.println("2. Data Perhiasan");
        System.out.println("3. Data Brankas");
        System.out.println("4. Data Perawatan");
        System.out.println("5. Data Transaksi Penjualan");
        System.out.println("6. Data Transaksi Pembayaran");
        System.out.println("7. Cetak Nota Pembayaran");
        System.out.println("8. Exit");
        pilihan();
    }

    private static void pilihan() throws IOException {

        System.out.print("Masukkan pilihan menu: ");
        pilih = Integer.parseInt(scan.readLine());
        System.out.println();
    }

    private static void n1() throws IOException {

        if (pilih == 1) {

            System.out.println("1. Entry Data Pelanggan");
            System.out.println("2. Update Data Pelanggan");
            System.out.println("3. Delete Data Pelanggan");

        } else if (pilih == 2) {

            System.out.println("1. Entry Data Perhiasan");
            System.out.println("2. Update Data Perhiasan");
            System.out.println("3. Delete Data Perhiasan");

        } else if (pilih == 3) {

            System.out.println("1. Entry Data Brankas");
            System.out.println("2. Update Data Brankas");
            System.out.println("3. Delete Data Brankas");

        } else if (pilih == 4) {

            System.out.println("1. Entry Data Perawatan");
            System.out.println("2. Update Data Perawatan");
            System.out.println("3. Delete Data Perawatan");

        } else if (pilih == 5) {

            System.out.println("1. Entry Data Transaksi Penjualan");
            System.out.println("2. Update Data Transaksi Penjualan");
            System.out.println("3. Delete Data Transaksi Penjualan");

        } else if (pilih == 6) {

            System.out.println("1. Entry Data Transaksi Pembayaran");
            System.out.println("2. Update Data Transaksi Pembayaran");
            System.out.println("3. Delete Data Transaksi Pembayaran");

        }
        pilihan();
    }
}

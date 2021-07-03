package com.Proyek;

import java.io.*;
import java.util.*;

public class KREASIPD {

    public static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    public static Vector<String> ID = new Vector<String>();
    public static Vector<String> nmPel = new Vector<String>();

    public static Vector<String> nmBar = new Vector<String>();
    public static Vector<Integer> hrgBar = new Vector<Integer>();
    public static Vector<Integer> jmlBar = new Vector<Integer>();

    public static Vector<Integer> totAwal = new Vector<Integer>();
    public static Vector<Integer> diskon = new Vector<Integer>();
    public static Vector<Integer> diskonRp = new Vector<Integer>();
    public static Vector<Integer> totAkhir = new Vector<Integer>();
    public static Vector<Integer> bayar = new Vector<Integer>();
    public static Vector<Integer> kembalian = new Vector<Integer>();

    public static int pilih;
    public static String S;

    public static void main(String[] args) throws IOException {

        while (true) {

            menu();

            switch (pilih) {

                case 1:
                    m1();
                    case1();
                    break;

                case 2:
                    m1();
                    case2();
                    break;

                case 3:
                    m1();
                    case3();
                    break;

                case 4:
                    m1();
                    case4();
                    break;

                case 5:
                    case5();
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menu() throws IOException {

        System.out.println("=====Menu=====");
        System.out.println("1. Data Pelanggan");
        System.out.println("2. Data Barang");
        System.out.println("3. Data Transaksi Penjualan");
        System.out.println("4. Data Transaksi Pembayaran");
        System.out.println("5. Nota");
        System.out.println("6. Exit");
        pilihan();
    }

    private static void pilihan() throws IOException {

        System.out.print("Masukkan pilihan menu: ");
        pilih = Integer.parseInt(scan.readLine());
        System.out.println();
    }

    public static void m1() throws IOException {

        if (pilih == 1) {

            System.out.println("=====Data Pelanggan=====");
            System.out.println("1. Entry Data Pelanggan");
            System.out.println("2. Update Data Pelanggan");
            System.out.println("3. Delete Data Pelanggan");
            System.out.println("4. Show Data Pelanggan");

        } else if (pilih == 2) {

            System.out.println("=====Data Barang=====");
            System.out.println("1. Entry Data Barang");
            System.out.println("2. Update Data Barang");
            System.out.println("3. Delete Data Barang");
            System.out.println("4. Show Data Barang");

        } else if (pilih == 3) {

            System.out.println("=====Data Transaksi Penjualan=====");
            System.out.println("1. Entry Data Transaksi Penjualan");
            System.out.println("2. Update Data Transaksi Penjualan");
            System.out.println("3. Delete Data Transaksi Penjualan");
            System.out.println("4. Show Data Transaksi Penjualan");

        } else if (pilih == 4) {

            System.out.println("=====Data Transaksi Pembayaran=====");
            System.out.println("1. Entry Data Transaksi Pembayaran");
            System.out.println("2. Update Data Transaksi Pembayaran");
            System.out.println("3. Delete Data Transaksi Pembayaran");
            System.out.println("4. Show Data Transaksi Pembayaran");

        }
        pilihan();
    }

    public static void case1() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Pelanggan=====");
                System.out.print("Berapa pelanggan: ");
                int bnyk = Integer.parseInt(scan.readLine());
                System.out.println();

                for (int i = 0; i < bnyk; i++) {

                    System.out.println("Pelanggan " + (i + 1));
                    System.out.print("ID Pelanggan: ");
                    ID.addElement(scan.readLine());
                    System.out.print("Nama Pelanggan: ");
                    nmPel.addElement(scan.readLine());
                    System.out.println();
                }
                break;

            case 2:

                System.out.println("=====Update Data Pelanggan=====");
                System.out.println();

                System.out.println("Data yang akan diganti:");
                System.out.print("ID/Nama? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("Masukkan ID Pelanggan: ");
                    String S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            ID.removeElementAt(i);
                            System.out.print("diganti dengan: ");
                            S = scan.readLine();
                            ID.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Nama")) {

                    System.out.print("Masukkan ID Pelanggan: ");
                    String S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            System.out.println("Nama: " + nmPel.elementAt(i));
                            nmPel.removeElementAt(i);
                            System.out.print("diganti dengan: ");
                            S = scan.readLine();
                            nmPel.insertElementAt(S, i);
                        }
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Pelanggan=====");
                System.out.println();

                if (ID.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {

                    System.out.print("Masukkan ID Pelanggan: ");
                    String S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            ID.removeElementAt(i);
                            nmPel.removeElementAt(i);
                            System.out.println("Data telah dihapus");
                        }
                    }
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Pelanggan=====");
                System.out.println();

                for (int i = 0; i < ID.size(); i++) {

                    System.out.println("ID Pelanggan: " + ID.elementAt(i));
                    System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                    System.out.println();
                }
                break;
        }
    }

    public static void case2() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Barang=====");
                System.out.println();

                for (int i = 0; i < ID.size(); i++) {

                    System.out.println("Pelanggan " + (i + 1));
                    System.out.print("Nama Barang: ");
                    nmBar.addElement(scan.readLine());
                    System.out.print("Harga Barang: Rp");
                    hrgBar.addElement(Integer.parseInt(scan.readLine()));
                    System.out.println();
                }
                break;

            case 2:

                System.out.println("=====Update Data Barang=====");
                System.out.println();

                System.out.println("Data yang akan diganti:");
                System.out.print("Nama/Harga? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("Nama")) {

                    System.out.print("Masukkan ID Pelanggan: ");
                    String S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            System.out.println("Nama Barang: " + nmBar.elementAt(i));
                            System.out.print("diganti dengan: ");
                            S = scan.readLine();
                            nmBar.set(i, S);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Harga")) {

                    System.out.print("Masukkan ID Pelanggan: ");
                    String S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            System.out.println("Harga Barang: Rp" + hrgBar.elementAt(i));
                            System.out.print("diganti dengan: ");
                            int B = Integer.parseInt(scan.readLine());
                            hrgBar.set(i, B);
                        }
                    }

                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Barang=====");
                System.out.println();

                if (ID.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {

                    System.out.print("Masukkan ID Pelanggan: ");
                    String S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            nmBar.removeElementAt(i);
                            hrgBar.removeElementAt(i);
                            System.out.println("Data telah dihapus");
                        }
                    }
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Barang=====");
                System.out.println();

                for (int i = 0; i < ID.size(); i++) {

                    System.out.println("ID Pelanggan: " + ID.elementAt(i));
                    System.out.println("Nama Barang: " + nmBar.elementAt(i));
                    System.out.println("Harga Barang: Rp" + hrgBar.elementAt(i));
                    System.out.println();
                }
                break;
        }
    }

    private static void case3() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Transaksi Penjualan=====");
                System.out.println();

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();

                for (int i = 0; i < ID.size(); i++) {
                    if (S.equalsIgnoreCase(ID.elementAt(i))) {

                        System.out.println("ID Pelanggan: " + ID.elementAt(i));
                        System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                        System.out.println("Nama Barang: " + nmBar.elementAt(i));
                        System.out.println("Harga Barang: Rp" + hrgBar.elementAt(i));
                        System.out.println();

                        System.out.println("===Masukkan Data===");
                        System.out.print("Jumlah Barang: ");
                        jmlBar.addElement(Integer.parseInt(scan.readLine()));
                        awal();
                        biaya();
                        System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                        System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                        System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                        System.out.println("Total Bayar: Rp" + totAkhir.elementAt(i));
                    }
                }
                System.out.println();
                break;

            case 2:

                System.out.println("=====Update Data Transaksi Penjualan=====");
                System.out.println();

                System.out.println("Data yang akan diganti: Jumlah");

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();

                for (int i = 0; i < ID.size(); i++) {
                    if (S.equalsIgnoreCase(ID.elementAt(i))) {

                        System.out.println("Jumlah Barang: " + jmlBar.elementAt(i));
                        System.out.print("diganti dengan: ");
                        int B = Integer.parseInt(scan.readLine());
                        jmlBar.set(i, B);
                        biaya();
                        System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                        System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                        System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                        System.out.println("Total Bayar: Rp" + totAkhir.elementAt(i));
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Transaksi Penjualan=====");
                System.out.println();

                if (ID.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {

                    System.out.print("Masukkan ID Pelanggan: ");
                    S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            totAwal.removeElementAt(i);
                            diskon.removeElementAt(i);
                            diskonRp.removeElementAt(i);
                            totAkhir.removeElementAt(i);
                            System.out.println("Data telah dihapus");
                        }
                    }
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Transaksi Penjualan=====");
                System.out.println();

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();

                for (int i = 0; i < ID.size(); i++) {
                    if (S.equalsIgnoreCase(ID.elementAt(i))) {

                        System.out.println("ID Pelanggan: " + ID.elementAt(i));
                        System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                        System.out.println("Nama Barang: " + nmBar.elementAt(i));
                        System.out.println("Harga Barang: " + hrgBar.elementAt(i));
                        System.out.println("Jumlah Barang: " + jmlBar.elementAt(i));
                        System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                        System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                        System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                        System.out.println("Total Bayar: Rp" + totAkhir.elementAt(i));
                        System.out.println();
                    }
                }
                break;
        }
    }

    private static int awal() throws IOException {

        for (int i = 0; i < ID.size(); i++) {
            if (S.equalsIgnoreCase(ID.elementAt(i))) {

                totAwal.addElement(hrgBar.elementAt(i));
                diskon.addElement(0);
                diskonRp.addElement(0);
                totAkhir.addElement(0);
            }
        }
        return 0;
    }

    private static int biaya() throws IOException {

        for (int i = 0; i < ID.size(); i++) {
            if (S.equalsIgnoreCase(ID.elementAt(i))) {

                totAwal.set(i, (hrgBar.elementAt(i) * jmlBar.elementAt(i)));

                if (jmlBar.elementAt(i) <= 10) {

                    diskon.set(i, 10);
                    diskonRp.set(i, (totAwal.elementAt(i) * 10 / 100));
                    totAkhir.set(i, (totAwal.elementAt(i) - diskonRp.elementAt(i)));

                } else if (jmlBar.elementAt(i) > 10 && jmlBar.elementAt(i) <= 20) {

                    diskon.set(i, 20);
                    diskonRp.set(i, (totAwal.elementAt(i) * 20 / 100));
                    totAkhir.set(i, (totAwal.elementAt(i) - diskonRp.elementAt(i)));

                } else if (jmlBar.elementAt(i) > 20) {

                    diskon.set(i, 30);
                    diskonRp.set(i, (totAwal.elementAt(i) * 30 / 100));
                    totAkhir.set(i, (totAwal.elementAt(i) - diskonRp.elementAt(i)));
                }
            }
        }
        return 0;

    }

    private static void case4() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Transaksi Pembayaran=====");
                System.out.println();

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();

                for (int i = 0; i < ID.size(); i++) {
                    if (S.equalsIgnoreCase(ID.elementAt(i))) {

                        System.out.println("ID Pelanggan: " + ID.elementAt(i));
                        System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                        System.out.println("Nama Barang: " + nmBar.elementAt(i));
                        System.out.println("Harga Barang: Rp" + hrgBar.elementAt(i));
                        System.out.println("Jumlah Barang: " + jmlBar.elementAt(i));
                        System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                        System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                        System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                        System.out.println("Total Bayar: Rp" + totAkhir.elementAt(i));
                        System.out.println();
                        awalBayar();
                        pembayaran();
                    }
                }
                System.out.println();
                break;

            case 2:

                System.out.println("=====Update Data Transaksi Pembayaran=====");
                System.out.println();

                System.out.println("Data yang akan diganti: Bayar");

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();

                for (int i = 0; i < ID.size(); i++) {
                    if (S.equalsIgnoreCase(ID.elementAt(i))) {

                        System.out.println("Pembayaran: " + bayar.elementAt(i));
                        System.out.println("diganti dengan: ");
                        pembayaran();
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Transaksi Pembayaran=====");
                System.out.println();

                if (ID.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {

                    System.out.print("Masukkan ID Pelanggan: ");
                    S = scan.readLine();

                    for (int i = 0; i < ID.size(); i++) {
                        if (S.equalsIgnoreCase(ID.elementAt(i))) {

                            bayar.removeElementAt(i);
                            kembalian.removeElementAt(i);
                            System.out.println("Data telah dihapus");
                        }
                    }
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Transaksi Pembayaran=====");
                System.out.println();

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();

                for (int i = 0; i < ID.size(); i++) {
                    if (S.equalsIgnoreCase(ID.elementAt(i))) {

                        System.out.println("ID Pelanggan: " + ID.elementAt(i));
                        System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                        System.out.println("Nama Barang: " + nmBar.elementAt(i));
                        System.out.println("Harga Barang: Rp" + hrgBar.elementAt(i));
                        System.out.println("Jumlah Barang: " + jmlBar.elementAt(i));
                        System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                        System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                        System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                        System.out.println("Total Bayar: Rp" + totAkhir.elementAt(i));
                        System.out.println("Pembayaran: Rp" + bayar.elementAt(i));
                        if (bayar.elementAt(i) > totAkhir.elementAt(i)) {
                            System.out.println("Kembalian: Rp" + kembalian.elementAt(i));
                        }
                        System.out.println();
                    }
                }
                break;
        }
    }

    private static int awalBayar() {

        for (int i = 0; i < ID.size(); i++) {
            if (S.equalsIgnoreCase(ID.elementAt(i))) {

                bayar.addElement(0);
                kembalian.addElement(0);
            }
        }
        return 0;
    }

    private static void pembayaran() throws IOException {

        for (int i = 0; i < ID.size(); i++) {
            if (ID.elementAt(i).equalsIgnoreCase(S)) {
                do {
                    System.out.print("Pembayaran: Rp");
                    bayar.set(i, Integer.parseInt(scan.readLine()));
                    if (bayar.elementAt(i) > totAkhir.elementAt(i)) {

                        kembalian.set(i, bayar.elementAt(i) - totAkhir.elementAt(i));
                        System.out.println("Kembalian: Rp" + kembalian.elementAt(i));

                    } else {
                        System.out.println("Uang tidak cukup");
                    }
                } while (bayar.elementAt(i) < totAkhir.elementAt(i));
            }
        }
    }

    private static void case5() throws IOException {

        System.out.println();
        System.out.print("Masukkan ID Pelanggan: ");
        S = scan.readLine();

        for (int i = 0; i < ID.size(); i++) {
            if (S.equalsIgnoreCase(ID.elementAt(i))) {

                System.out.println("ID Pelanggan: " + ID.elementAt(i));
                System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                System.out.println("Nama Barang: " + nmBar.elementAt(i));
                System.out.println("Harga Barang: Rp" + hrgBar.elementAt(i));
                System.out.println("Jumlah Barang: " + jmlBar.elementAt(i));
                System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                System.out.println("Total Bayar: Rp" + totAkhir.elementAt(i));
                System.out.println("Pembayaran: Rp" + bayar.elementAt(i));
                if (bayar.elementAt(i) > totAkhir.elementAt(i)) {
                    System.out.println("Kembalian: Rp" + kembalian.elementAt(i));
                }
                System.out.println();
            }
        }
    }
}

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
                    dataPel();
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

            System.out.println("=====Data Pelanggan=====");
            System.out.println("1. Entry Data Pelanggan");
            System.out.println("2. Update Data Pelanggan");
            System.out.println("3. Delete Data Pelanggan");

        } else if (pilih == 2) {

            System.out.println("=====Data Perhiasan=====");
            System.out.println("1. Entry Data Perhiasan");
            System.out.println("2. Update Data Perhiasan");
            System.out.println("3. Delete Data Perhiasan");

        } else if (pilih == 3) {

            System.out.println("=====Data Brankas=====");
            System.out.println("1. Entry Data Brankas");
            System.out.println("2. Update Data Brankas");
            System.out.println("3. Delete Data Brankas");

        } else if (pilih == 4) {

            System.out.println("=====Data Perawatan=====");
            System.out.println("1. Entry Data Perawatan");
            System.out.println("2. Update Data Perawatan");
            System.out.println("3. Delete Data Perawatan");

        } else if (pilih == 5) {

            System.out.println("=====Data Transaksi Penjualan=====");
            System.out.println("1. Entry Data Transaksi Penjualan");
            System.out.println("2. Update Data Transaksi Penjualan");
            System.out.println("3. Delete Data Transaksi Penjualan");

        } else if (pilih == 6) {

            System.out.println("=====Data Transaksi Pembayaran=====");
            System.out.println("1. Entry Data Transaksi Pembayaran");
            System.out.println("2. Update Data Transaksi Pembayaran");
            System.out.println("3. Delete Data Transaksi Pembayaran");

        }
        pilihan();
    }

    private static void dataPel() throws IOException {

        switch (pilih) {

            case 1:
                System.out.println("=====Entry Data Pelanggan=====");
                System.out.println();

                System.out.print("Banyak Pelanggan: ");
                int byk = Integer.parseInt(scan.readLine());
                System.out.println();

                for (int i = 0; i < byk; i++) {

                    System.out.println("Data Pelanggan " + (i + 1));

                    System.out.print("ID Pelanggan: ");
                    String ID = scan.readLine();

                    for (int j = 0; j < IDPel.size(); j++) {
                        if (ID.equalsIgnoreCase(IDPel.elementAt(j))) {

                            do {
                                System.out.println("ID sudah terdaftar ganti yang lain");
                                System.out.print("ID Pelanggan: ");
                                ID = scan.readLine();
                            } while (ID.equalsIgnoreCase(IDPel.elementAt(j)));
                        }
                    }
                    IDPel.addElement(ID);

                    System.out.print("Nama Pelanggan: ");
                    nmPel.addElement(scan.readLine());
                    System.out.print("Alamat: ");
                    almt.addElement(scan.readLine());
                    System.out.print("Nomor Telepon: ");
                    telp.addElement(scan.readLine());
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("=====Update Data Pelanggan=====");
                System.out.println();

                System.out.println("Data apa yang akan diganti: ");
                System.out.println("ID/Nama/Alamat/Telepon/Semua");
                String ganti = scan.readLine();
                String S;

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {

                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            IDPel.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            IDPel.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Nama")) {

                    System.out.print("Nama: ");
                    S = scan.readLine();
                    for (int i = 0; i < nmPel.size(); i++) {
                        if (S.equalsIgnoreCase(nmPel.elementAt(i))) {

                            nmPel.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            nmPel.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Alamat")) {

                    System.out.print("Alamat: ");
                    S = scan.readLine();
                    for (int i = 0; i < almt.size(); i++) {
                        if (S.equalsIgnoreCase(almt.elementAt(i))) {

                            almt.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            almt.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Telepon")) {

                    System.out.print("Telepon: ");
                    S = scan.readLine();
                    for (int i = 0; i < telp.size(); i++) {
                        if (S.equalsIgnoreCase(telp.elementAt(i))) {

                            telp.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            telp.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Semua")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            IDPel.removeElementAt(i);
                            nmPel.removeElementAt(i);
                            almt.removeElementAt(i);
                            telp.removeElementAt(i);
                            System.out.println("===Ganti===");
                            System.out.print("ID Pelanggan: ");
                            IDPel.insertElementAt(scan.readLine(), i);
                            System.out.print("Nama Pelanggan: ");
                            nmPel.insertElementAt(scan.readLine(), i);
                            System.out.print("Alamat: ");
                            almt.insertElementAt(scan.readLine(), i);
                            System.out.print("Nomor Telepon: ");
                            telp.insertElementAt(scan.readLine(), i);
                        }
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Pelanggan=====");
                System.out.println();

                if (IDPel.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {
                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            IDPel.removeElementAt(i);
                            nmPel.removeElementAt(i);
                            almt.removeElementAt(i);
                            telp.removeElementAt(i);
                        }
                    }
                    System.out.println("Data telah dihapus");
                }
                System.out.println();
                break;

            case 4:

                for (int i = 0; i < IDPel.size(); i++) {

                    System.out.println("Data Pelanggan " + (i + 1));
                    System.out.println("ID Pelanggan: " + IDPel.elementAt(i));
                    System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                    System.out.println("Alamat: " + almt.elementAt(i));
                    System.out.println("Telepon: " + telp.elementAt(i));
                    System.out.println();
                }
                break;
        }

    }
}

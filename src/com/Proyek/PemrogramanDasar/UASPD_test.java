package com.Proyek.PemrogramanDasar;

import java.util.*;
import java.io.*;

public class UASPD_test {

    public static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    public static Vector<String> IDPel = new Vector<String>();
    public static Vector<String> nmPel = new Vector<String>();
    public static Vector<String> almt = new Vector<String>();
    public static Vector<String> telp = new Vector<String>();

    public static Vector<String> IDBran = new Vector<String>();
    public static Vector<String> nmBran = new Vector<String>();
    public static Vector<String> lokasi = new Vector<String>();
    public static Vector<String> tglSimpan = new Vector<String>();

    public static Vector<String> IDPerhi = new Vector<String>();
    public static Vector<String> jenPerhi = new Vector<String>();
    public static Vector<String> bahPerhi = new Vector<String>();
    public static Vector<Integer> berPerhi = new Vector<Integer>();

    public static Vector<String> IDTranSim = new Vector<String>();
    public static Vector<Integer> lama = new Vector<Integer>();
    public static Vector<Integer> totAwal = new Vector<Integer>();
    public static Vector<Integer> diskon = new Vector<Integer>();
    public static Vector<Integer> diskonRp = new Vector<Integer>();
    public static Vector<Integer> totAkhir = new Vector<Integer>();

    public static Vector<String> IDTranPer = new Vector<String>();
    public static Vector<String> IDPera = new Vector<String>();
    public static Vector<String> jenPera = new Vector<String>();

    public static Vector<Integer> totAkhTran = new Vector<Integer>();
    public static Vector<Integer> bayar = new Vector<Integer>();
    public static Vector<Integer> kembalian = new Vector<Integer>();

    public static Vector<Integer> bayarPersen = new Vector<Integer>();
    public static Vector<Integer> bayarRP = new Vector<Integer>();

    public static int pilih;
    public static String S;

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
                    dataBran();
                    break;

                case 3:

                    n1();
                    dataPerhi();
                    break;

                case 4:

                    n1();
                    dataPera();
                    break;

                case 5:

                    n1();
                    tranSimpan();
                    break;

                case 6:

                    n1();
                    tranRawat();
                    break;

                case 7:
                    nota();
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
        System.out.println("2. Data Brankas");
        System.out.println("3. Data Perhiasan");
        System.out.println("4. Data Perawatan");
        System.out.println("5. Data Transaksi Penyimpanan");
        System.out.println("6. Data Transaksi Perawatan");
        System.out.println("7. Cetak Nota");
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
            System.out.println("4. Show Data Pelanggan");

        } else if (pilih == 3) {

            System.out.println("=====Data Perhiasan=====");
            System.out.println("1. Entry Data Perhiasan");
            System.out.println("2. Update Data Perhiasan");
            System.out.println("3. Delete Data Perhiasan");
            System.out.println("4. Show Data Perhiasan");

        } else if (pilih == 2) {

            System.out.println("=====Data Brankas=====");
            System.out.println("1. Entry Data Brankas");
            System.out.println("2. Update Data Brankas");
            System.out.println("3. Delete Data Brankas");
            System.out.println("4. Show Data Pelanggan");

        } else if (pilih == 4) {

            System.out.println("=====Data Perawatan=====");
            System.out.println("1. Entry Data Perawatan");
            System.out.println("2. Update Data Perawatan");
            System.out.println("3. Delete Data Perawatan");
            System.out.println("4. Show Data Perawatan");

        } else if (pilih == 5) {

            System.out.println("=====Data Transaksi Penyimpanan=====");
            System.out.println("1. Entry Data Transaksi Penyimpanan");
            System.out.println("2. Update Data Transaksi Penyimpanan");
            System.out.println("3. Delete Data Transaksi Penyimpanan");
            System.out.println("4. Show Data Transaksi Penyimpanan");

        } else if (pilih == 6) {

            System.out.println("=====Data Transaksi Perawatan=====");
            System.out.println("1. Entry Data Transaksi Perawatan");
            System.out.println("2. Update Data Transaksi Perawatan");
            System.out.println("3. Delete Data Transaksi Perawatan");
            System.out.println("4. Show Data Transaksi Perawatan");

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
                System.out.print("ID/Nama/Alamat/Telepon/Semua? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            IDPel.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            for (int j = 0; j < IDPel.size(); j++) {
                                if (S.equalsIgnoreCase(IDPel.elementAt(j))) {
                                    do {
                                        System.out.println("ID sudah terdaftar ganti yang lain");
                                        System.out.print("Diganti dengan: ");
                                        S = scan.readLine();
                                    } while (S.equalsIgnoreCase(IDPel.elementAt(j)));
                                }
                            }
                            IDPel.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Nama")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Nama: " + nmPel.elementAt(i));
                            nmPel.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            nmPel.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Alamat")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Alamat: " + almt.elementAt(i));
                            almt.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            almt.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Telepon")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Telepon: " + telp.elementAt(i));
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

                System.out.println("=====Show Data Pelanggan=====");
                System.out.println();

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

    private static void dataBran() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Brankas=====");
                System.out.println();

                for (int i = 0; i < IDPel.size(); i++) {

                    System.out.println("Data Brankas " + (i + 1));

                    System.out.print("ID Brankas: ");
                    String ID = scan.readLine();

                    for (int j = 0; j < IDBran.size(); j++) {
                        if (ID.equalsIgnoreCase(IDBran.elementAt(j))) {

                            do {
                                System.out.println("ID sudah terdaftar ganti yang lain");
                                System.out.print("ID Brankas: ");
                                ID = scan.readLine();
                            } while (ID.equalsIgnoreCase(IDBran.elementAt(j)));
                        }
                    }
                    IDBran.addElement(ID);

                    System.out.print("Nama Brankas: ");
                    nmBran.addElement(scan.readLine());
                    System.out.print("Lokasi Brankas: ");
                    lokasi.addElement(scan.readLine());
                    System.out.println();
                }
                break;

            case 2:

                System.out.println("=====Update Data Brankas=====");
                System.out.println();

                System.out.println("Data apa yang akan diganti: ");
                System.out.print("ID/Nama/Lokasi/Semua? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Brankas: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDBran.size(); i++) {

                        if (S.equalsIgnoreCase(IDBran.elementAt(i))) {

                            IDBran.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            for (int j = 0; j < IDBran.size(); j++) {
                                if (S.equalsIgnoreCase(IDBran.elementAt(j))) {
                                    do {
                                        System.out.println("ID sudah terdaftar ganti yang lain");
                                        System.out.print("Diganti dengan: ");
                                        S = scan.readLine();
                                    } while (S.equalsIgnoreCase(IDBran.elementAt(j)));
                                }
                            }
                            IDBran.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Nama")) {

                    System.out.print("ID Brankas: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDBran.size(); i++) {
                        if (S.equalsIgnoreCase(IDBran.elementAt(i))) {

                            System.out.println("Nama: " + nmBran.elementAt(i));
                            nmBran.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            nmBran.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Lokasi")) {

                    System.out.print("ID Brankas: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDBran.size(); i++) {
                        if (S.equalsIgnoreCase(IDBran.elementAt(i))) {

                            System.out.println("Lokasi: " + lokasi.elementAt(i));
                            lokasi.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            lokasi.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Semua")) {

                    System.out.print("ID Brankas: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDBran.size(); i++) {
                        if (S.equalsIgnoreCase(IDBran.elementAt(i))) {

                            IDBran.removeElementAt(i);
                            nmBran.removeElementAt(i);
                            lokasi.removeElementAt(i);
                            tglSimpan.removeElementAt(i);
                            System.out.println("===Ganti===");
                            System.out.print("ID Brankas: ");
                            IDBran.insertElementAt(scan.readLine(), i);
                            System.out.print("Nama Brankas: ");
                            nmBran.insertElementAt(scan.readLine(), i);
                            System.out.print("Lokasi: ");
                            lokasi.insertElementAt(scan.readLine(), i);
                        }
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Brankas=====");
                System.out.println();

                if (IDBran.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {
                    System.out.print("ID Brankas: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDBran.size(); i++) {
                        if (S.equalsIgnoreCase(IDBran.elementAt(i))) {

                            IDBran.removeElementAt(i);
                            nmBran.removeElementAt(i);
                            lokasi.removeElementAt(i);
                        }
                    }
                    System.out.println("Data telah dihapus");
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Brankas=====");
                System.out.println();

                for (int i = 0; i < IDBran.size(); i++) {

                    System.out.println("Data Brankas " + (i + 1));
                    System.out.println("ID Brankas: " + IDBran.elementAt(i));
                    System.out.println("Nama Brankas: " + nmBran.elementAt(i));
                    System.out.println("Lokasi: " + lokasi.elementAt(i));
                    System.out.println();
                }
                break;
        }
    }

    private static void dataPerhi() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Perhiasan=====");
                System.out.println();

                for (int i = 0; i < IDPel.size(); i++) {

                    System.out.println("Data Perhiasan Pelanggan " + (i + 1));

                    System.out.print("ID Perhiasan: ");
                    IDPerhi.addElement(scan.readLine());
                    System.out.print("Jenis Perhiasan: ");
                    jenPerhi.addElement(scan.readLine());
                    System.out.print("Bahan Perhiasan: ");
                    bahPerhi.addElement(scan.readLine());
                    System.out.println();
                }
                break;

            case 2:

                System.out.println("=====Update Data Perhiasan=====");
                System.out.println();

                System.out.println("Data apa yang akan diganti: ");
                System.out.print("ID/Jenis/Bahan/Semua? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Perhiasan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPerhi.size(); i++) {
                        if (S.equalsIgnoreCase(IDPerhi.elementAt(i))) {

                            IDPerhi.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();

                            for (int j = 0; j < IDPerhi.size(); j++) {
                                if (S.equalsIgnoreCase(IDPerhi.elementAt(j))) {
                                    do {
                                        System.out.println("ID sudah terdaftar ganti yang lain");
                                        System.out.print("Diganti dengan: ");
                                        S = scan.readLine();
                                    } while (S.equalsIgnoreCase(IDPerhi.elementAt(j)));
                                }
                            }
                            IDPerhi.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Jenis")) {

                    System.out.print("ID Perhiasan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPerhi.size(); i++) {
                        if (S.equalsIgnoreCase(IDPerhi.elementAt(i))) {

                            System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(i));
                            jenPerhi.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            jenPerhi.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Bahan")) {

                    System.out.print("ID Perhiasan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPerhi.size(); i++) {
                        if (S.equalsIgnoreCase(IDPerhi.elementAt(i))) {

                            System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(i));
                            bahPerhi.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            bahPerhi.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Semua")) {

                    System.out.print("ID Perhiasan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPerhi.size(); i++) {
                        if (S.equalsIgnoreCase(IDPerhi.elementAt(i))) {

                            IDPerhi.removeElementAt(i);
                            jenPerhi.removeElementAt(i);
                            bahPerhi.removeElementAt(i);
                            System.out.println("===Ganti===");
                            System.out.print("ID Perhiasan: ");
                            IDPerhi.insertElementAt(scan.readLine(), i);
                            System.out.print("Jenis Perhiasan: ");
                            jenPerhi.insertElementAt(scan.readLine(), i);
                            System.out.print("Bahan Perhiasan: ");
                            bahPerhi.insertElementAt(scan.readLine(), i);
                        }
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Perhiasan=====");
                System.out.println();

                if (IDPerhi.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {
                    System.out.print("ID Perhiasan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPerhi.size(); i++) {
                        if (S.equalsIgnoreCase(IDPerhi.elementAt(i))) {

                            IDPerhi.removeElementAt(i);
                            jenPerhi.removeElementAt(i);
                            bahPerhi.removeElementAt(i);
                        }
                    }
                    System.out.println("Data telah dihapus");
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Perhiasan=====");
                System.out.println();

                for (int i = 0; i < IDPerhi.size(); i++) {

                    System.out.println("Data Perhiasan " + (i + 1));
                    System.out.println("ID Perhiasan: " + IDPerhi.elementAt(i));
                    System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(i));
                    System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(i));
                    System.out.println();
                }
                break;
        }
    }

    private static void dataPera() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Perawatan=====");
                System.out.println();

                System.out.println("===Menu Jenis Perawatan===");
                System.out.println("Bersih/Cuci/Tidak");
                System.out.println();

                for (int i = 0; i < IDPerhi.size(); i++) {

                    System.out.println("Data Perawatan Perhiasan " + (i + 1));

                    System.out.print("ID Perawatan: ");
                    IDPera.addElement(scan.readLine());
                    System.out.print("Jenis Perawatan: ");
                    jenPera.addElement(scan.readLine());
                    System.out.println();
                }
                break;

            case 2:

                System.out.println("=====Update Data Perawatan=====");
                System.out.println();

                System.out.println("Data apa yang akan diganti: ");
                System.out.print("ID/Jenis/Semua? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Perawatan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPera.size(); i++) {
                        if (S.equalsIgnoreCase(IDPera.elementAt(i))) {

                            IDPera.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();

                            for (int j = 0; j < IDPera.size(); j++) {
                                if (S.equalsIgnoreCase(IDPera.elementAt(j))) {
                                    do {
                                        System.out.println("ID sudah terdaftar ganti yang lain");
                                        System.out.print("Diganti dengan: ");
                                        S = scan.readLine();
                                    } while (S.equalsIgnoreCase(IDPera.elementAt(j)));
                                }
                            }
                            IDPera.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Jenis")) {

                    System.out.print("ID Perawatan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPera.size(); i++) {
                        if (S.equalsIgnoreCase(IDPera.elementAt(i))) {

                            System.out.println("Jenis Perawatan: " + jenPera.elementAt(i));
                            jenPera.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            jenPera.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Semua")) {

                    System.out.print("ID Perawatan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPera.size(); i++) {
                        if (S.equalsIgnoreCase(IDPera.elementAt(i))) {

                            IDPera.removeElementAt(i);
                            jenPera.removeElementAt(i);
                            System.out.println("===Ganti===");
                            System.out.print("ID Perawatan: ");
                            IDPerhi.insertElementAt(scan.readLine(), i);
                            System.out.print("Jenis Perawatan: ");
                            jenPerhi.insertElementAt(scan.readLine(), i);
                        }
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Perawatan=====");
                System.out.println();

                if (IDPera.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {
                    System.out.print("ID Perawatan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPera.size(); i++) {
                        if (S.equalsIgnoreCase(IDPera.elementAt(i))) {

                            IDPera.removeElementAt(i);
                            jenPera.removeElementAt(i);
                        }
                    }
                    System.out.println("Data telah dihapus");
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Perawatan=====");
                System.out.println();

                for (int i = 0; i < IDPera.size(); i++) {

                    System.out.println("Data Perawatan Perhiasan " + (i + 1));
                    System.out.println("ID Perawatan: " + IDPera.elementAt(i));
                    System.out.println("Jenis Perawatan: " + jenPera.elementAt(i));
                    System.out.println();
                }
                break;
        }
    }

    private static void tranSimpan() throws IOException {

        switch (pilih) {

            case 1:
                System.out.println("=====Entry Data Transaksi Penyimpanan=====");
                System.out.println();

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();
                for (int i = 0; i < IDPel.size(); i++) {
                    if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                        System.out.print("Masukkan ID Brankas: ");
                        S = scan.readLine();
                        for (int j = 0; j < IDBran.size(); j++) {
                            if (S.equalsIgnoreCase(IDBran.elementAt(j))) {

                                System.out.print("Masukkan ID Perhiasan: ");
                                S = scan.readLine();
                                for (int k = 0; k < IDPerhi.size(); k++) {
                                    if (S.equalsIgnoreCase(IDPerhi.elementAt(k))) {

                                        S = IDPel.elementAt(i);
                                        System.out.println("Daftar Penyimpanan Pelanggan: " + IDPel.elementAt(i));
                                        System.out.println("Nama: " + nmPel.elementAt(i));
                                        System.out.println("Alamat: " + almt.elementAt(i));
                                        System.out.println("Nomor Telepon: " + telp.elementAt(i));
                                        System.out.println("ID Brankas: " + IDBran.elementAt(j));
                                        System.out.println("Nama Brankas: " + nmBran.elementAt(j));
                                        System.out.println("Lokasi Brankas: " + lokasi.elementAt(j));
                                        System.out.println("ID Perhiasan: " + IDPerhi.elementAt(k));
                                        System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(k));
                                        System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(k));
                                        System.out.println();

                                        System.out.println("=====Masukkan Data=====");
                                        System.out.print("ID Transaksi Penyimpanan: ");
                                        IDTranSim.addElement(scan.readLine());
                                        System.out.print("Tanggal Penyimpanan: ");
                                        tglSimpan.addElement(scan.readLine());
                                        System.out.print("Berat Pehiasan(gram): ");
                                        berPerhi.addElement(Integer.parseInt(scan.readLine()));
                                        System.out.print("Lama Simpan(tahun): ");
                                        lama.addElement(Integer.parseInt(scan.readLine()));

                                        biayaAwal();
                                        biaya();
                                        System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                                        System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                                        System.out.println("Diskon(Rp): Rp" + diskonRp.elementAt(i));
                                        System.out.println("Total Akhir: Rp" + totAkhir.elementAt(i));
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println();
                break;

            case 2:
                System.out.println("=====Update Data Transaksi Penyimpanan=====");
                System.out.println();

                System.out.println("Data apa yang akan diganti: ");
                System.out.print("ID/Berat/Lama Simpan/TglSimpan/Semua? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("ID Transaksi Penyimpanan: " + IDTranSim.elementAt(i));
                            System.out.print("Diganti dengan: ");
                            String A = scan.readLine();
                            IDTranSim.set(i, A);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Berat")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Berat Perhiasan(gram): " + berPerhi.elementAt(i));
                            System.out.print("Diganti dengan: ");
                            int A = Integer.parseInt(scan.readLine());
                            berPerhi.set(i, A);
                            biaya();
                            System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                            System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                            System.out.println("Diskon(Rp): Rp" + diskonRp.elementAt(i));
                            System.out.println("Total Akhir: Rp" + totAkhir.elementAt(i));
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Lama Simpan")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Lama Simpan(tahun): " + lama.elementAt(i));
                            System.out.print("Diganti dengan: ");
                            int A = Integer.parseInt(scan.readLine());
                            lama.set(i, A);
                            biaya();
                            System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                            System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                            System.out.println("Diskon(Rp): Rp" + diskonRp.elementAt(i));
                            System.out.println("Total Akhir: Rp" + totAkhir.elementAt(i));
                        }
                    }

                } else if (ganti.equalsIgnoreCase("TglSimpan")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Tanggal Penyimpanan: " + tglSimpan.elementAt(i));
                            tglSimpan.removeElementAt(i);
                            System.out.print("Diganti dengan: ");
                            S = scan.readLine();
                            tglSimpan.insertElementAt(S, i);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Semua")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("===Ganti===");
                            System.out.print("ID Transaksi Penyimpanan: ");
                            String D = scan.readLine();
                            IDTranSim.set(i, D);
                            System.out.print("Tanggal Penyimpanan:: ");
                            String C = scan.readLine();
                            tglSimpan.set(i, C);
                            System.out.print("Berat Perhiasan(gram): ");
                            int A = Integer.parseInt(scan.readLine());
                            berPerhi.set(i, A);
                            System.out.print("Lama Simpan(tahun): ");
                            int B = Integer.parseInt(scan.readLine());
                            lama.set(i, B);
                            biaya();
                            System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                            System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                            System.out.println("Diskon(Rp): Rp" + diskonRp.elementAt(i));
                            System.out.println("Total Akhir: Rp" + totAkhir.elementAt(i));
                        }
                    }
                }
                System.out.println();
                break;

            case 3:
                System.out.println("=====Delete Data Transaksi Penyimpanan=====");
                System.out.println();

                if (IDTranSim.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {

                    System.out.print("Masukkan ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            IDTranSim.removeElementAt(i);
                            tglSimpan.removeElementAt(i);
                            berPerhi.removeElementAt(i);
                            lama.removeElementAt(i);
                            totAwal.removeElementAt(i);
                            diskon.removeElementAt(i);
                            diskonRp.removeElementAt(i);
                            totAkhir.removeElementAt(i);
                        }
                        System.out.println("Data telah dihapus");
                    }
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Transaksi Penyimpanan=====");
                System.out.println();

                for (int i = 0; i < IDTranSim.size(); i++) {

                    System.out.println("Daftar Penyimpanan Pelanggan: " + (i + 1));
                    System.out.println("ID Pelanggan: " + IDPel.elementAt(i));
                    System.out.println("Nama: " + nmPel.elementAt(i));
                    System.out.println("Alamat: " + almt.elementAt(i));
                    System.out.println("Nomor Telepon: " + telp.elementAt(i));
                    System.out.println("ID Brankas: " + IDBran.elementAt(i));
                    System.out.println("Nama Brankas: " + nmBran.elementAt(i));
                    System.out.println("Lokasi Brankas: " + lokasi.elementAt(i));
                    System.out.println("ID Perhiasan: " + IDPerhi.elementAt(i));
                    System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(i));
                    System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(i));

                    System.out.println("ID Transaksi Penyimpanan: " + IDTranSim.elementAt(i));
                    System.out.println("Tanggal Penyimpanan: " + tglSimpan.elementAt(i));
                    System.out.println("Berat Pehiasan(gram): " + berPerhi.elementAt(i) + " gram");
                    System.out.println("Lama Simpan(tahun): " + lama.elementAt(i) + " tahun");

                    System.out.println("Total Awal: Rp" + totAwal.elementAt(i));
                    System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                    System.out.println("Diskon(Rp): Rp" + diskonRp.elementAt(i));
                    System.out.println("Total Akhir: Rp" + totAkhir.elementAt(i));
                    System.out.println();
                }
                break;
        }
    }

    private static int biayaAwal() throws IOException {

        for (int i = 0; i < IDPel.size(); i++) {
            if (IDPel.elementAt(i).equalsIgnoreCase(S)) {

                if (bahPerhi.elementAt(i).equalsIgnoreCase("Emas")) {

                    totAwal.addElement(30000);

                } else {

                    totAwal.addElement(20000);
                }
                diskon.addElement(0);
                diskonRp.addElement(0);
                totAkhir.addElement(0);
            }
        }
        return 0;
    }

    private static int biaya() throws IOException {

        for (int i = 0; i < IDPel.size(); i++) {

            if (IDPel.elementAt(i).equalsIgnoreCase(S)) {

                if (berPerhi.elementAt(i) < 20) {

                    totAwal.set(i, totAwal.elementAt(i) + 10000);

                } else if (berPerhi.elementAt(i) >= 20 && berPerhi.elementAt(i) < 50) {

                    totAwal.set(i, totAwal.elementAt(i) + 20000);

                } else if (berPerhi.elementAt(i) >= 50) {

                    totAwal.set(i, totAwal.elementAt(i) + 30000);

                }

                // Biaya Lainnya
                totAwal.set(i, totAwal.elementAt(i) + 50000);
                // Biaya Lama Simpan
                totAwal.set(i, totAwal.elementAt(i) * lama.elementAt(i));

                // Diskon
                if (totAwal.elementAt(i) < 200000) {

                    diskon.set(i, 10);
                    diskonRp.set(i, diskon.elementAt(i) * totAwal.elementAt(i) / 100);
                    totAkhir.set(i, totAwal.elementAt(i) - diskonRp.elementAt(i));

                } else if (totAwal.elementAt(i) >= 200000 && totAwal.elementAt(i) < 600000) {

                    diskon.set(i, 20);
                    diskonRp.set(i, diskon.elementAt(i) * totAwal.elementAt(i) / 100);
                    totAkhir.set(i, totAwal.elementAt(i) - diskonRp.elementAt(i));

                } else if (totAwal.elementAt(i) >= 600000) {

                    diskon.set(i, 30);
                    diskonRp.set(i, diskon.elementAt(i) * totAwal.elementAt(i) / 100);
                    totAkhir.set(i, totAwal.elementAt(i) - diskonRp.elementAt(i));
                }
            }
        }
        return 0;
    }

    private static void tranRawat() throws IOException {

        switch (pilih) {

            case 1:

                System.out.println("=====Entry Data Transaksi Perawatan=====");
                System.out.println();

                System.out.print("Masukkan ID Pelanggan: ");
                S = scan.readLine();
                for (int i = 0; i < IDPel.size(); i++) {
                    if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                        System.out.print("Masukkan ID Perawatan: ");
                        S = scan.readLine();
                        for (int m = 0; m < IDPera.size(); m++) {
                            if (S.equalsIgnoreCase(IDPera.elementAt(m))) {

                                System.out.print("Masukkan ID Transaksi Penyimpanan: ");
                                S = scan.readLine();
                                for (int j = 0; j < IDTranSim.size(); j++) {
                                    if (S.equalsIgnoreCase(IDTranSim.elementAt(j))) {

                                        S = IDPel.elementAt(i);
                                        System.out.println("Daftar Penyimpanan Pelanggan: " + IDPel.elementAt(i));
                                        System.out.println("Nama: " + nmPel.elementAt(j));
                                        System.out.println("Alamat: " + almt.elementAt(j));
                                        System.out.println("Nomor Telepon: " + telp.elementAt(j));
                                        System.out.println("ID Brankas: " + IDBran.elementAt(j));
                                        System.out.println("Nama Brankas: " + nmBran.elementAt(j));
                                        System.out.println("Lokasi Brankas: " + lokasi.elementAt(j));
                                        System.out.println("ID Perhiasan: " + IDPerhi.elementAt(j));
                                        System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(j));
                                        System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(j));
                                        System.out.println("Berat Pehiasan: " + berPerhi.elementAt(j));
                                        System.out.println("Lama Simpan: " + lama.elementAt(j));
                                        System.out.println("Tanggal Penyimpanan: " + tglSimpan.elementAt(j));
                                        System.out.println("ID Perawatan: " + IDPera.elementAt(m));
                                        System.out.println("Jenis Perawatan: " + jenPera.elementAt(m));
                                        System.out.println("Total Akhir: Rp" + totAkhir.elementAt(j));
                                        System.out.println();

                                        System.out.println("===Masukkan Data===");
                                        System.out.print("ID Transaksi Perawatan: ");
                                        IDTranPer.addElement(scan.readLine());

                                        biayaAwal2();
                                        rawat();
                                        System.out
                                                .println("Total Setelah Biaya Perawatan: Rp" + totAkhTran.elementAt(j));
                                        System.out.println();
                                        System.out.println("===Pembayaran===");
                                        pembayaran();
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println();
                break;

            case 2:

                System.out.println("=====Update Data Transaksi Perawatan=====");
                System.out.println();

                System.out.println("Data apa yang akan diganti: ");
                System.out.print("ID/Bayar/Semua? ");
                String ganti = scan.readLine();

                if (ganti.equalsIgnoreCase("ID")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("ID Transaksi Perawatan: " + IDTranPer.elementAt(i));
                            System.out.print("Diganti dengan: ");
                            String A = scan.readLine();
                            IDTranPer.set(i, A);
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Bayar")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.println("Total Setelah Biaya Perawatan: Rp" + totAkhTran.elementAt(i));
                            pembayaran();
                        }
                    }

                } else if (ganti.equalsIgnoreCase("Semua")) {

                    System.out.print("ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            System.out.print("ID Transaksi Perawatan: ");
                            String A = scan.readLine();
                            IDTranPer.set(i, A);
                            pembayaran();
                        }
                    }
                }
                System.out.println();
                break;

            case 3:

                System.out.println("=====Delete Data Transaksi Perawatan=====");
                System.out.println();

                if (IDTranPer.isEmpty()) {
                    System.out.println("Data Kosong");

                } else {

                    System.out.print("Masukkan ID Pelanggan: ");
                    S = scan.readLine();
                    for (int i = 0; i < IDPel.size(); i++) {
                        if (S.equalsIgnoreCase(IDPel.elementAt(i))) {

                            IDTranPer.removeElementAt(i);
                            bayar.removeElementAt(i);
                            kembalian.removeElementAt(i);
                            totAkhTran.removeElementAt(i);
                        }
                        System.out.println("Data telah dihapus");
                    }
                }
                System.out.println();
                break;

            case 4:

                System.out.println("=====Show Data Transaksi Perawatan=====");
                System.out.println();

                for (int i = 0; i < IDTranPer.size(); i++) {

                    System.out.println("ID Pelanggan: " + IDPel.elementAt(i));
                    System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                    System.out.println("Alamat Pelanggan: " + almt.elementAt(i));
                    System.out.println("Nomor Telepon: " + telp.elementAt(i));
                    System.out.println("ID Brankas: " + IDBran.elementAt(i));
                    System.out.println("Nama Brankas: " + nmBran.elementAt(i));
                    System.out.println("Lokasi Brankas: " + lokasi.elementAt(i));
                    System.out.println("ID Perhiasan: " + IDPerhi.elementAt(i));
                    System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(i));
                    System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(i));
                    System.out.println("Berat Perhiasan: " + berPerhi.elementAt(i));
                    System.out.println("ID Perawatan: " + IDPera.elementAt(i));
                    System.out.println("Jenis Perawatan: " + jenPera.elementAt(i));
                    System.out.println("ID Transaksi Penyimpanan: " + IDTranSim.elementAt(i));
                    System.out.println("Tanggal Penyimpanan: " + tglSimpan.elementAt(i));
                    System.out.println("Lama Penyimpanan: " + lama.elementAt(i));
                    System.out.println("ID Transaksi Perawatan: " + IDTranPer.elementAt(i));
                    System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                    System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                    System.out.println("Total Pembayaran: Rp" + totAkhTran.elementAt(i));
                    if (bayar.elementAt(i) != 0) {
                        System.out.println("Pembayaran: " + bayar.elementAt(i));

                    } else {
                        System.out.println("Pembayaran: " + totAkhTran.elementAt(i));
                    }
                    if (bayar.elementAt(i) > totAkhTran.elementAt(i)) {
                        System.out.println("Kembalian: Rp" + kembalian.elementAt(i));
                    }
                    System.out.println("Cashback: " + bayarPersen.elementAt(i) + "%");
                    System.out.println("Cashback: Rp" + bayarRP.elementAt(i));
                    System.out.println("Total Setelah Cashback: Rp" + totAkhTran.elementAt(i));
                }
                System.out.println();
                break;
        }
    }

    private static int biayaAwal2() throws IOException {

        for (int i = 0; i < IDPel.size(); i++) {
            if (IDPel.elementAt(i).equalsIgnoreCase(S)) {

                totAkhTran.addElement(0);
                bayar.addElement(0);
                kembalian.addElement(0);
            }
        }
        return 0;
    }

    private static int rawat() {

        for (int i = 0; i < IDPerhi.size(); i++) {
            if (IDPel.elementAt(i).equalsIgnoreCase(S)) {

                if (jenPera.elementAt(i).equalsIgnoreCase("Bersih")) {

                    totAkhTran.set(i, totAkhir.elementAt(i) + (lama.elementAt(i) * 50000));

                } else if (jenPera.elementAt(i).equalsIgnoreCase("Cuci")) {

                    totAkhTran.set(i, totAkhir.elementAt(i) + (lama.elementAt(i) * 100000));

                } else if (jenPera.elementAt(i).equalsIgnoreCase("Tidak")) {

                    totAkhTran.set(i, totAkhir.elementAt(i) + 0);
                }
            }
        }
        return 0;
    }

    private static void pembayaran() throws IOException {

        for (int i = 0; i < IDPel.size(); i++) {
            if (IDPel.elementAt(i).equalsIgnoreCase(S)) {

                System.out.println("Jenis Pembayaran");
                System.out.println("Tunai/OVO/ShopeePay");
                System.out.print("Jenis Pembayaran: ");
                String b = scan.readLine();

                if (b.equalsIgnoreCase("Tunai")) {
                    do {
                        System.out.print("Pembayaran: Rp");
                        bayar.set(i, Integer.parseInt(scan.readLine()));
                        if (bayar.elementAt(i) > totAkhTran.elementAt(i)) {

                            kembalian.set(i, bayar.elementAt(i) - totAkhTran.elementAt(i));
                            System.out.println("Kembalian: Rp" + kembalian.elementAt(i));

                        } else {
                            System.out.println("Uang tidak cukup");
                        }
                    } while (bayar.elementAt(i) < totAkhTran.elementAt(i));

                    System.out.println();
                    System.out.println("Pembayaran: Rp" + bayar.elementAt(i));
                    System.out.println("===Konfirmasi Pembayaran===");
                    System.out.println("Kirim/Ganti?");
                    b = scan.readLine();
                    System.out.println();

                    if (b.equalsIgnoreCase("Ganti")) {
                        kembalian.set(i, 0);
                        bayar.set(i, 0);
                        pembayaran();
                    }

                } else if (b.equalsIgnoreCase("OVO")) {

                    bayarPersen.addElement(20);
                    bayarRP.addElement(totAkhTran.elementAt(i) * 20 / 100);

                    System.out.println("Cashback: " + bayarPersen.elementAt(i) + "%");
                    System.out.println("Cashback: Rp" + bayarRP.elementAt(i));

                    totAkhTran.set(i, (totAkhTran.elementAt(i) - bayarRP.elementAt(i)));

                    System.out.println("Total Setelah Cashback: Rp" + totAkhTran.elementAt(i));

                    System.out.println("Pembayaran: Rp" + totAkhTran.elementAt(i));
                    System.out.println("===Konfirmasi Pembayaran===");
                    System.out.println("Kirim/Ganti?");
                    b = scan.readLine();
                    System.out.println();

                    if (b.equalsIgnoreCase("Ganti")) {
                        totAkhTran.set(i, (totAkhTran.elementAt(i) + bayarRP.elementAt(i)));
                        bayarPersen.removeElementAt(i);
                        bayarRP.removeElementAt(i);
                        pembayaran();
                    }

                } else if (b.equalsIgnoreCase("ShopeePay")) {

                    bayarPersen.addElement(10);
                    bayarRP.addElement(totAkhTran.elementAt(i) * 10 / 100);

                    System.out.println("Cashback: " + bayarPersen.elementAt(i) + "%");
                    System.out.println("Cashback: Rp" + bayarRP.elementAt(i));

                    totAkhTran.set(i, (totAkhTran.elementAt(i) - bayarRP.elementAt(i)));

                    System.out.println("Total Setelah Cashback: Rp" + totAkhTran.elementAt(i));

                    System.out.println("Pembayaran: Rp" + totAkhTran.elementAt(i));
                    System.out.println("===Konfirmasi Pembayaran===");
                    System.out.println("Kirim/Ganti?");
                    b = scan.readLine();
                    System.out.println();

                    if (b.equalsIgnoreCase("Ganti")) {
                        totAkhTran.set(i, (totAkhTran.elementAt(i) + bayarRP.elementAt(i)));
                        bayarPersen.removeElementAt(i);
                        bayarRP.removeElementAt(i);
                        pembayaran();
                    }
                }
            }
        }
    }

    private static void nota() throws IOException {

        System.out.println("=====Nota=====");
        System.out.println();

        System.out.print("ID Transaksi Perawatan: ");
        S = scan.readLine();
        System.out.println();
        for (int i = 0; i < IDTranPer.size(); i++) {
            if (S.equalsIgnoreCase(IDTranPer.elementAt(i))) {

                System.out.println("ID Pelanggan: " + IDPel.elementAt(i));
                System.out.println("Nama Pelanggan: " + nmPel.elementAt(i));
                System.out.println("Alamat Pelanggan: " + almt.elementAt(i));
                System.out.println("Nomor Telepon: " + telp.elementAt(i));
                System.out.println("ID Brankas: " + IDBran.elementAt(i));
                System.out.println("Nama Brankas: " + nmBran.elementAt(i));
                System.out.println("Lokasi Brankas: " + lokasi.elementAt(i));
                System.out.println("ID Perhiasan: " + IDPerhi.elementAt(i));
                System.out.println("Jenis Perhiasan: " + jenPerhi.elementAt(i));
                System.out.println("Bahan Perhiasan: " + bahPerhi.elementAt(i));
                System.out.println("Berat Perhiasan: " + berPerhi.elementAt(i));
                System.out.println("ID Perawatan: " + IDPera.elementAt(i));
                System.out.println("Jenis Perawatan: " + jenPera.elementAt(i));
                System.out.println("ID Transaksi Penyimpanan: " + IDTranSim.elementAt(i));
                System.out.println("Tanggal Penyimpanan: " + tglSimpan.elementAt(i));
                System.out.println("Lama Penyimpanan: " + lama.elementAt(i));
                System.out.println("ID Transaksi Perawatan: " + IDTranPer.elementAt(i));
                System.out.println("Diskon: " + diskon.elementAt(i) + "%");
                System.out.println("Diskon: Rp" + diskonRp.elementAt(i));
                System.out.println("Total Pembayaran: Rp" + totAkhTran.elementAt(i));
                if (bayar.elementAt(i) != 0) {
                    System.out.println("Pembayaran: " + bayar.elementAt(i));

                } else {
                    System.out.println("Pembayaran: " + totAkhTran.elementAt(i));
                }
                if (bayar.elementAt(i) > totAkhTran.elementAt(i)) {
                    System.out.println("Kembalian: Rp" + kembalian.elementAt(i));
                }
                System.out.println("Cashback: " + bayarPersen.elementAt(i) + "%");
                System.out.println("Cashback: Rp" + bayarRP.elementAt(i));
                System.out.println("Total Setelah Cashback: Rp" + totAkhTran.elementAt(i));
            }
        }
        System.out.println();
    }
}

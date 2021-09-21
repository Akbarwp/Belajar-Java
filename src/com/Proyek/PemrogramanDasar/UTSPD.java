package com.Proyek.PemrogramanDasar;

import java.io.*;

public class UTSPD {

    public static void main(String[] args) throws IOException {

        // input1[i][0] = Tanggal Awal Penyimpanan
        // input1[i][1] = Nama
        // input1[i][2] = Alamat
        // input1[i][3] = Nomor Telepon
        // input1[i][4] = Kode Brankas
        // input1[i][5] = Jenis Perhiasan
        // input1[i][6] = Bahan Perhiasan
        // input1[i][7] = Cara Membayar
        // input1[i][8] = Bank Transfer

        // per[i][0] = Banyak Perhiasan
        // per[i][1] = Lama Penyimpanan
        // per[i][2] = Total
        // per[i][3] = Berat Perhiasan
        // per[i][4] = Total Berat Perhiasan
        // per[i][5] = Diskon
        // per[i][6] = Diskon Rp
        // per[i][7] = Total Akhir
        // per[i][8] = Total Awal
        // per[i][9] = DP
        // per[i][10] = Cicilan
        // per[i][11] = Bayar
        // per[i][12] = Kembalian

        // ambil[i][0] = Nama
        // ambil[i][1] = Tanggal Awal Penyimpanan
        // ambil[i][2] = Tanggal Pengambilan
        // ambil[i][3] = Bank Transfer
        // ambil[i][4] = Barang Diambil
        // ambil[i][5] = Pembayaran

        // amb[i][0] = Biaya Admin
        // amb[i][1] = Banyak Barang Diambil
        // amb[i][2] = Bayar
        // amb[i][3] = Kembalian

        // rawat[i][0] = Jenis Perawatan

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bp1 = 0, am1 = 0;
        String rawat1;

        String[][] input1 = new String[10][10];
        int[][] per = new int[10][20];
        char[][] rawat = new char[10][10];

        String[][] ambil = new String[10][10];
        int[][] amb = new int[10][10];

        System.out.println("=====Penyimpanan Barang Perhiasan=====");

        while (true) {

            System.out.println("=====Menu=====");
            System.out.println("1. Pendaftaran");
            System.out.println("2. Informasi Penyimpanan");
            System.out.println("3. Pembayaran");
            System.out.println("4. Nota Pembayaran");
            System.out.println("5. Pengambilan");
            System.out.println("6. Nota Pengambilan");
            System.out.println("7. Keluar");

            System.out.print("Pilih Menu: ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {

                case 1:
                    System.out.println("=====Pendaftaran=====");
                    System.out.print("Berapa Pelanggan: ");
                    int bp = Integer.parseInt(br.readLine());
                    bp1 += bp;
                    System.out.println("");
                    int k = 0;

                    for (int i = 0; i < bp; i++) {

                        per[k][4] = 0;
                        per[i][2] = 0;

                        System.out.println("===Nomor Pelanggan ke-" + (i + 1) + "===");
                        System.out.print("Masukkan Tanggal Awal Penyimpanan: ");
                        input1[i][0] = br.readLine();
                        System.out.print("Masukkan Nama: ");
                        input1[i][1] = br.readLine();
                        System.out.print("Masukkan Alamat: ");
                        input1[i][2] = br.readLine();
                        System.out.print("Masukkan Nomor Telepon: ");
                        input1[i][3] = br.readLine();
                        System.out.print("Masukkan Kode Brankas: ");
                        input1[i][4] = br.readLine();
                        System.out.print("Masukkan Banyak Perhiasan: ");
                        per[i][0] = Integer.parseInt(br.readLine());
                        System.out.println("");

                        for (int j = 0; j < per[i][0]; j++) {

                            System.out.print("Masukkan Jenis Perhiasan ke-" + (j + 1) + ": ");
                            input1[k][5] = br.readLine();
                            System.out.print("Masukkan Bahan Perhiasan: ");
                            input1[k][6] = br.readLine();
                            System.out.print("Masukkan Berat Perhiasan (gram): ");
                            per[k][3] = Integer.parseInt(br.readLine());
                            per[i][4] += per[k][3];
                            System.out.println("");

                            // System.out.println("Jenis Perhiasan");
                            if (input1[k][5].equalsIgnoreCase("Cincin")) {

                                per[i][2] += 10000;

                            } else if (input1[k][5].equalsIgnoreCase("Kalung")) {

                                per[i][2] += 20000;

                            } else if (input1[k][5].equalsIgnoreCase("Gelang")) {

                                per[i][2] += 30000;

                            } else if (input1[k][5].equalsIgnoreCase("Anting")) {

                                per[i][2] += 40000;

                            } else {

                                per[i][2] += 15000;
                            }

                            // System.out.println("Bahan Perhiasan");
                            if (input1[k][6].equalsIgnoreCase("Perunggu")) {

                                per[i][2] += 10000;

                            } else if (input1[k][6].equalsIgnoreCase("Perak")) {

                                per[i][2] += 20000;

                            } else if (input1[k][6].equalsIgnoreCase("Emas")) {

                                per[i][2] += 30000;

                            } else if (input1[k][6].equalsIgnoreCase("Berlian")) {

                                per[i][2] += 40000;

                            } else {

                                per[i][2] += 15000;
                            }

                            // System.out.println("Berat Perhiasan");
                            if (per[k][3] < 10) {

                                per[i][2] += 10000;

                            } else if (per[k][3] >= 10 && per[k][3] <= 100) {

                                per[i][2] += 20000;

                            } else if (per[k][3] > 100 && per[k][3] <= 1000) {

                                per[i][2] += 30000;

                            } else if (per[k][3] > 1000) {

                                per[i][2] += 40000;
                            }
                            k++;
                        }

                        System.out.print("Apakah Anda ingin ada perawatan pada perhiasan?(Y/T): ");
                        String jawab = br.readLine();

                        if (jawab.equalsIgnoreCase("Y")) {

                            System.out.print("Pilih Perawatan (A/B/C/D): ");
                            rawat1 = br.readLine();
                            rawat[i][0] = rawat1.charAt(0);

                        } else {

                            rawat[i][0] = 'T';
                        }

                        System.out.print("Masukkan Lama Penyimpanan(tahun): ");
                        per[i][1] = Integer.parseInt(br.readLine());
                        System.out.println("");
                    }

                    // System.out.println("Jenis Perawatan");
                    for (int i = 0; i < bp1; i++) {

                        if (rawat[i][0] == 'A') {

                            per[i][2] += 10000;

                        } else if (rawat[i][0] == 'B') {

                            per[i][2] += 20000;

                        } else if (rawat[i][0] == 'C') {

                            per[i][2] += 30000;

                        } else if (rawat[i][0] == 'D') {

                            per[i][2] += 40000;

                        } else {

                            per[i][2] += 0;
                        }
                    }

                    // System.out.println("Total Awal");
                    for (int i = 0; i < bp1; i++) {

                        per[i][8] = per[i][2] * per[i][1];

                    }

                    // System.out.println("Diskon");
                    for (int i = 0; i < bp1; i++) {

                        if (per[i][8] < 100000) {

                            // System.out.println("Diskon: 0%");
                            per[i][5] = 0;
                            per[i][6] = per[i][8] * 0 / 100;
                            per[i][7] = per[i][8] - per[i][6];

                        } else if (per[i][8] >= 100000 && per[i][8] < 300000) {

                            // System.out.println("Diskon: 10%");
                            per[i][5] = 10;
                            per[i][6] = per[i][8] * 10 / 100;
                            per[i][7] = per[i][8] - per[i][6];

                        } else if (per[i][8] >= 300000 && per[i][8] < 500000) {

                            // System.out.println("Diskon: 20%");
                            per[i][5] = 20;
                            per[i][6] = per[i][8] * 20 / 100;
                            per[i][7] = per[i][8] - per[i][6];

                        } else if (per[i][8] >= 500000) {

                            // System.out.println("Diskon: 30%");
                            per[i][5] = 30;
                            per[i][6] = per[i][8] * 30 / 100;
                            per[i][7] = per[i][8] - per[i][6];

                        }
                    }
                    break;

                case 2:

                    System.out.println("=====Informasi Penyimpanan=====");
                    System.out.println("");

                    int p = 0;

                    for (int i = 0; i < bp1; i++) {

                        System.out.println("===Nomor Pelanggan ke-" + (i + 1) + "===");
                        System.out.println("Tanggal Awal Penyimpanan: " + input1[i][0]);
                        System.out.println("Nama: " + input1[i][1]);
                        System.out.println("Alamat: " + input1[i][2]);
                        System.out.println("Nomor Telepon: " + input1[i][3]);
                        System.out.println("Kode Brankas: " + input1[i][4]);
                        System.out.println("");

                        for (int j = 0; j < per[i][0]; j++) {

                            System.out.println("Jenis Perhiasan ke-" + (j + 1) + ": " + input1[p][5]);
                            System.out.println("Bahan Perhiasan: " + input1[p][6]);
                            System.out.println("Berat Perhiasan: " + per[p][3] + " gram");
                            System.out.println("");
                            p++;
                        }

                        System.out.println("Jenis Perawatan : " + rawat[i][0]);
                        System.out.println("Lama Penyimpanan: " + per[i][1] + " tahun");
                        System.out.println("Total Berat Semua Perhiasan: " + per[i][4] + " gram");
                        System.out.println("Total Biaya Awal: Rp" + per[i][8]);
                        System.out.println("Diskon: " + per[i][5] + "%");
                        System.out.println("Diskon: Rp" + per[i][6]);
                        System.out.println("Total Biaya Akhir: Rp" + per[i][7]);
                        System.out.println("");
                    }

                    System.out.println("");
                    break;

                case 3:

                    System.out.println("=====Pembayaran=====");
                    System.out.println("");

                    for (int i = 0; i < bp1; i++) {

                        System.out.println("===Nomor Pelanggan ke-" + (i + 1) + "===");
                        System.out.println("Atas Nama: " + input1[i][1]);
                        System.out.print("Masukkan Pilihan Membayar(Debit/Transfer/Tunai): ");
                        input1[i][7] = br.readLine();
                        System.out.println("Total Biaya Akhir: Rp" + per[i][7]);

                        if (input1[i][7].equalsIgnoreCase("Debit")) {

                            per[i][9] = per[i][7] * 10 / 100;
                            per[i][10] = (per[i][7] - per[i][9]) / 12;
                            System.out.println("Biaya Down Payment (DP): Rp" + per[i][9]);
                            System.out.println("Biaya Cicilan 12x: Rp" + per[i][10]);

                        } else if (input1[i][7].equalsIgnoreCase("Transfer")) {

                            System.out.print("Masukkan Nama Bank Transfer: ");
                            input1[i][8] = br.readLine();
                            System.out.print("Masukkan Nominal Pembayaran: Rp");
                            per[i][11] = Integer.parseInt(br.readLine());

                        } else if (input1[i][7].equalsIgnoreCase("Tunai")) {

                            do {

                                System.out.print("Masukkan Nominal Pembayaran: Rp");
                                per[i][11] = Integer.parseInt(br.readLine());

                                if (per[i][11] < per[i][7]) {

                                    System.out.println("Maaf uang Anda tidak cukup");

                                } else if (per[i][11] > per[i][7]) {

                                    per[i][12] = per[i][11] - per[i][7];
                                    System.out.println("Uang Kembalian: Rp" + per[i][12]);

                                }
                            } while (per[i][11] < per[i][7]);
                        }

                        System.out.println("");

                    }
                    System.out.println("");
                    break;

                case 4:

                    System.out.println("=====Nota Pembayaran=====");
                    System.out.println("");
                    int q = 0;

                    for (int i = 0; i < bp1; i++) {

                        System.out.println("===Nomor Pelanggan ke-" + (i + 1) + "===");
                        System.out.println("Nama: " + input1[i][1]);
                        System.out.println("Tanggal Awal Penyimpanan: " + input1[i][0]);
                        System.out.println("Alamat: " + input1[i][2]);
                        System.out.println("Nomor Telepon: " + input1[i][3]);
                        System.out.println("Kode Brankas: " + input1[i][4]);
                        System.out.println("");

                        for (int j = 0; j < per[i][0]; j++) {

                            System.out.println("Jenis Perhiasan ke-" + (j + 1) + ": " + input1[q][5]);
                            System.out.println("Bahan Perhiasan: " + input1[q][6]);
                            System.out.println("Berat Perhiasan: " + per[q][3] + " gram");
                            System.out.println("");
                            q++;
                        }

                        System.out.println("Pilihan Pembayaran: " + input1[i][7]);

                        if (input1[i][7].equalsIgnoreCase("Debit")) {

                            System.out.println("Biaya Down Payment (DP): Rp" + per[i][9]);
                            System.out.println("Biaya Cicilan 12x: Rp" + per[i][10]);
                            System.out.println("");

                        } else if (input1[i][7].equalsIgnoreCase("Transfer")) {

                            System.out.println("Nama Bank Transfer: " + input1[i][8]);
                            System.out.println("Nominal Pembayaran: RP" + per[i][11]);
                            System.out.println("Status: Lunas");
                            System.out.println("");

                        } else if (input1[i][7].equalsIgnoreCase("Tunai")) {

                            System.out.println("Nominal Pembayaran: RP" + per[i][11]);

                            if (per[i][11] > per[i][7]) {

                                System.out.println("Uang Kembalian: RP" + per[i][12]);
                            }
                            System.out.println("Status: Lunas");
                            System.out.println("");
                        }
                    }

                    System.out.println("");
                    break;

                case 5:

                    am1 = 0;
                    System.out.println("=====Pengambilan Perhiasan=====");
                    System.out.print("Berapa Pelanggan: ");
                    int am = Integer.parseInt(br.readLine());
                    am1 += am;

                    String cari;
                    boolean found = false;
                    System.out.println("");

                    for (int i = 0; i < am; i++) {

                        System.out.println("===Nomor Pelanggan ke-" + (i + 1) + "===");
                        System.out.print("Masukkan Nama: ");
                        ambil[i][0] = br.readLine();
                        System.out.print("Masukkan Tanggal Awal Penyimpanan: ");
                        ambil[i][1] = br.readLine();
                        System.out.print("Masukkan Tanggal Pengambilan: ");
                        ambil[i][2] = br.readLine();

                        do {

                            System.out.print("Masukkan Kode Brankas: ");
                            cari = br.readLine();

                            for (int a = 0; a < bp1; a++) {

                                if (input1[a][4].equalsIgnoreCase(cari)) {

                                    found = true;
                                    System.out.println("Data Ditemukan");
                                }
                            }

                            if (found == false) {

                                System.out.println("Data Tidak Ditemukan");
                                System.out.println("");
                            }

                        } while (found == false);

                        System.out.print("Berapa Barang yang Diambil: ");
                        amb[i][1] = Integer.parseInt(br.readLine());

                        for (int b = 0; b < amb[i][1]; b++) {

                            System.out.print("Nama Perhiasan: ");
                            ambil[i][4] = br.readLine();
                        }

                        if (per[i][8] < 100000) {

                            amb[i][0] = 30000;
                            System.out.println("Biaya Admin: Rp" + amb[i][0]);

                        } else if (per[i][8] >= 100000 && per[i][8] < 300000) {

                            amb[i][0] = 25000;
                            System.out.println("Biaya Admin: Rp" + amb[i][0]);

                        } else if (per[i][8] >= 300000 && per[i][8] < 500000) {

                            amb[i][0] = 20000;
                            System.out.println("Biaya Admin: Rp" + amb[i][0]);

                        } else if (per[i][8] >= 500000) {

                            amb[i][0] = 15000;
                            System.out.println("Biaya Admin: Rp" + amb[i][0]);

                        }

                        System.out.print("Masukkan Pilihan Membayar(Transfer/Tunai): ");
                        ambil[i][5] = br.readLine();

                        if (ambil[i][5].equalsIgnoreCase("Transfer")) {

                            System.out.print("Masukkan Nama Bank Transfer: ");
                            ambil[i][3] = br.readLine();
                            System.out.print("Masukkan Nominal Pembayaran: Rp");
                            amb[i][2] = Integer.parseInt(br.readLine());

                        } else if (ambil[i][5].equalsIgnoreCase("Tunai")) {

                            do {

                                System.out.print("Masukkan Nominal Pembayaran: Rp");
                                amb[i][2] = Integer.parseInt(br.readLine());

                                if (amb[i][2] < amb[i][0]) {

                                    System.out.println("Maaf uang Anda tidak cukup");

                                } else if (amb[i][2] > amb[i][0]) {

                                    amb[i][3] = amb[i][2] - amb[i][0];

                                }
                            } while (amb[i][2] < amb[i][0]);
                        }
                        System.out.println("");
                    }
                    break;

                case 6:

                    for (int i = 0; i < am1; i++) {

                        System.out.println("===Nomor Pelanggan: " + (i + 1) + "===");
                        System.out.println("Nama: " + ambil[i][0]);
                        System.out.println("Tanggal Awal Penyimpanan: " + ambil[i][1]);
                        System.out.println("Tanggal Pengambilan: " + ambil[i][2]);
                        System.out.println("Kode Brankas: " + input1[i][4]);
                        System.out.println();

                        int m = 0;

                        for (int j = 0; j < amb[i][1]; j++) {

                            System.out.println("Nama Perhiasan: " + ambil[m][4]);
                            m++;
                        }

                        System.out.println("Biaya Admin: Rp" + amb[i][0]);
                        System.out.println("Pilihan Pembayaran: " + ambil[i][5]);

                        if (ambil[i][5].equalsIgnoreCase("Transfer")) {

                            System.out.println("Nama Bank Transfer: " + ambil[i][3]);
                        }
                        System.out.println("Nominal Pembayaran: Rp" + amb[i][2]);

                        if (amb[i][2] > amb[i][0]) {
                            System.out.println("Uang Kembalian: Rp" + amb[i][3]);
                        }
                        System.out.println("Status: Lunas");
                        System.out.println("");
                    }
                    break;

                case 7:
                    System.out.println("=====Terima Kasih Telah Menggunakan Jasa Kami=====");
                    System.exit(0);
                    break;

            }
        }
    }
}

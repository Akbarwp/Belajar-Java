package com.Tugas;

import java.util.*;

public class ClassQueue {

    public static void main(String[] args) {

        Queue<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);

        int panjang = 5;
        System.out.println("Panjang Queue: " + panjang);
        System.out.println("");

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(11);

        while (true) {

            Menu();
            System.out.print("Masukkan menu: ");
            int pilih = scan.nextInt();
            System.out.println("");

            switch (pilih) {

                case 1:
                    Tambah(list, scan, panjang);
                    break;

                case 2:
                    Hapus(list);
                    break;

                case 3:
                    Clear(list);
                    break;

                case 4:
                    Get(list);
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }

    }

    private static void Menu() {

        System.out.println("=====Menu=====");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Hapus Semua Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar");
    }

    private static void Tambah(Queue<Integer> list, Scanner scan, int panjang) {

        if (list.size() == panjang) {

            System.out.println("Queue sudah penuh");

        } else {

            System.out.println("Masukkan data: ");
            list.add(scan.nextInt());
        }

        System.out.println("");
    }

    private static void Hapus(Queue<Integer> list) {

        if (list.isEmpty()) {

            System.out.println("Data kosong");

        } else {

            System.out.println("Hapus data: " + list.poll());
        }

        System.out.println("");
    }

    private static void Clear(Queue<Integer> list) {

        System.out.println("Menghapus semua data");
        list.clear();
        System.out.println("");
    }

    private static void Get(Queue<Integer> list) {

        if (list.isEmpty()) {

            System.out.println("Data kosong");

        } else {

            System.out.println("isi Queue: " + list);
            System.out.println("Data paling atas: " + list.peek());
            System.out.println("Ukuran Queue: " + list.size());

        }
        System.out.println("");
    }

}

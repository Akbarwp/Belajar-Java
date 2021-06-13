package com.Proyek;

import java.util.*;

public class ClassStack {

    public static void main(String[] args) {

        Stack<Integer> list = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);

        int panjang = 5;
        System.out.println("Panjang Stack: " + panjang);
        System.out.println("");

        list.push(3);
        list.push(7);
        list.push(2);
        list.push(5);
        list.push(11);

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

    private static void Tambah(Stack<Integer> list, Scanner scan, int panjang) {

        if (list.size() == panjang) {

            System.out.println("Stack sudah penuh");

        } else {

            System.out.println("Masukkan data: ");
            list.push(scan.nextInt());
        }

        System.out.println("");
    }

    private static void Hapus(Stack<Integer> list) {

        if (list.isEmpty()) {

            System.out.println("Data kosong");

        } else {

            System.out.println("Hapus data: " + list.pop());
        }

        System.out.println("");
    }

    private static void Clear(Stack<Integer> list) {

        System.out.println("Menghapus semua data");
        list.clear();
        System.out.println("");
    }

    private static void Get(Stack<Integer> list) {

        if (list.isEmpty()) {

            System.out.println("Data kosong");

        } else {

            System.out.println("Data paling atas: " + list.peek());
            System.out.println("Ukuran Stack: " + list.size());
            while (!list.empty()) {

                System.out.println(list.pop());

            }
        }
        System.out.println("");
    }

}

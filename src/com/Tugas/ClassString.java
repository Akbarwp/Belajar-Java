package com.Tugas;

import java.util.*;

public class ClassString {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan kata: ");
        String nama = scan.nextLine();

        upper(nama);
        lower(nama);
        trim(nama);
        System.out.println();
        concat(nama);
        System.out.println();
        substr(nama);
        System.out.println();
        replace(nama);
    }

    private static void upper(String nama) {

        System.out.println("=====UpperCase=====");
        nama = nama.toUpperCase();
        System.out.println(nama);
    }

    private static void lower(String nama) {

        System.out.println("=====LowerCase=====");
        nama = nama.toLowerCase();
        System.out.println(nama);
    }

    private static void concat(String nama) {

        System.out.println("=====Concat=====");
        System.out.print("Masukkan kata: ");
        String kata = scan.nextLine();
        nama = nama.concat(kata);
        System.out.println(nama);
    }

    private static void substr(String nama) {

        System.out.println("=====SubString=====");
        System.out.print("Masukkan awal: ");
        int awal = scan.nextInt();
        System.out.print("Masukkan akhir: ");
        int akhir = scan.nextInt();
        nama = nama.substring(awal - 1, akhir);
        System.out.println(nama);
    }

    private static void replace(String nama) {

        System.out.println("=====Replace=====");
        System.out.print("Masukkan kata lama: ");
        String old = scan.nextLine();
        System.out.print("Masukkan kata baru: ");
        String baru = scan.nextLine();
        nama = nama.replace(old, baru);
        System.out.println(nama);
    }

    private static void trim(String nama) {

        System.out.println("=====Trim=====");
        nama = nama.trim();
        System.out.println(nama);
    }
}

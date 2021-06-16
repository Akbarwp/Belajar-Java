package com.Tugas;

import java.io.*;

public class ClassStringBuffer {

    public static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.print("Masukkan kata: ");
        StringBuffer kata = new StringBuffer(scan.readLine());
        System.out.println();

        pc(kata);
        add(kata);
        plus(kata);
        hapus(kata);
        hHuruf(kata);
        ganti(kata);
        balik(kata);
        ensure(kata);

    }

    private static void pc(StringBuffer kata) {

        System.out.println("=====Length & Capacity=====");
        System.out.println("StringBuffer: " + kata);
        int x = kata.length();
        int y = kata.capacity();
        System.out.println("Panjang: " + x);
        System.out.println("Kapasitas: " + y);
        System.out.println();
    }

    private static void add(StringBuffer kata) throws IOException {

        System.out.println("=====Append=====");
        System.out.print("Masukkan kata tambahan: ");
        kata.append(scan.readLine());
        System.out.println("StringBuffer: " + kata);
        System.out.println();
    }

    private static void plus(StringBuffer kata) throws IOException {

        System.out.println("=====Insert=====");
        System.out.print("Masukkan index ke: ");
        int index = Integer.parseInt(scan.readLine());
        System.out.print("Masukkan kata: ");
        String m = scan.readLine();
        kata.insert(index, m);
        System.out.println("StringBuffer: " + kata);
        System.out.println();
    }

    private static void balik(StringBuffer kata) {

        System.out.println("=====Reverse=====");
        kata.reverse();
        System.out.println("StringBuffer: " + kata);
        System.out.println();
    }

    private static void hapus(StringBuffer kata) throws IOException {

        System.out.println("=====Delete=====");
        System.out.print("Masukkan index awal: ");
        int x = Integer.parseInt(scan.readLine());
        System.out.print("Masukkan index akhir: ");
        int y = Integer.parseInt(scan.readLine());
        kata.delete(x, y);
        System.out.println("StringBuffer: " + kata);
        System.out.println();
    }

    private static void hHuruf(StringBuffer kata) throws IOException {

        System.out.println("=====DeleteCharAt=====");
        System.out.print("Masukkan index ke: ");
        kata.deleteCharAt(Integer.parseInt(scan.readLine()));
        System.out.println("StringBuffer: " + kata);
        System.out.println();
    }

    private static void ganti(StringBuffer kata) throws IOException {

        System.out.println("=====Replace=====");
        System.out.print("Masukkan index awal: ");
        int x = Integer.parseInt(scan.readLine());
        System.out.print("Masukkan index akhir: ");
        int y = Integer.parseInt(scan.readLine());
        System.out.print("Masukkan kata pengganti: ");
        String m = scan.readLine();
        kata.replace(x, y, m);
        System.out.println("StringBuffer: " + kata);
        System.out.println();
    }

    private static void ensure(StringBuffer kata) throws IOException {

        System.out.println("=====Ensure Capacity=====");
        System.out.print("Masukkan Min kapasitas: ");
        kata.ensureCapacity(Integer.parseInt(scan.readLine()));
        int y = kata.capacity();
        System.out.println("Kapasitas: " + y);
        System.out.println();
    }

}

package com.Proyek.StrukturData;

// import untuk dapat menggunakan BufferedReader
import java.io.*;
// import untuk dapat menggunakan LinkedList
import java.util.*;

public class SDLinkedList {

    public static void main(String[] args) throws IOException {

        // Deklarasi BufferedReader
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        // Deklarasi LinkedList bertipe data String
        LinkedList<String> link = new LinkedList<String>();

        // Looping untuk Menu
        while (true) {

            // Membuat tampilan menu
            System.out.println("=====MENU=====");
            System.out.println("1. Input Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Show Data");
            System.out.println("5. Input Data Pertama");
            System.out.println("6. Input Data Terakhir");
            System.out.println("7. Exit");
            System.out.print("Masukkan menu pilihan: ");
            // Menginputkan pilihan menu
            int pilih = Integer.parseInt(scan.readLine());
            System.out.println();

            // Switch case untuk membuat menu-menu pilihan
            switch (pilih) {
                case 1:
                    System.out.println("=====Input Data=====");
                    // Memberi batasan untuk berapa banyak data yang akan diinputkan
                    System.out.print("Berapa banyak data: ");
                    int byk = Integer.parseInt(scan.readLine());
                    System.out.println();

                    // Looping untuk memasukkan data pada LinkedList
                    for (int i = 0; i < byk; i++) {

                        System.out.print("Data " + (i + 1) + ": ");
                        link.add(scan.readLine());
                    }
                    break;

                case 2:
                    System.out.println("=====Update Data=====");
                    // Untuk meminta urutan data yang akan diganti
                    System.out.print("Data urutan ke berapa yang akan diganti: ");
                    int index = Integer.parseInt(scan.readLine());
                    // Untuk menampilkan data pada urutan yang diminta
                    System.out.println("Data pada urutan " + index + ": " + link.get(index - 1));
                    System.out.print("Data diganti dengan: ");
                    // Menginputkan data baru
                    String ganti = scan.readLine();
                    // Data pada LinkedList akan diganti menggunakan operator set()
                    link.set((index - 1), ganti);
                    break;

                case 3:
                    System.out.println("=====Delete Data=====");
                    // Untuk meminta urutan data yang akan dihapus
                    System.out.print("Data urutan ke berapa yang akan dihapus: ");
                    int hapus = Integer.parseInt(scan.readLine());
                    // Untuk menampilkan data pada urutan yang diminta
                    System.out.println("Data pada urutan " + hapus + ": " + link.get(hapus - 1));
                    // Data pada LinkedList akan dihapus menggunakan operator remove()
                    link.remove(hapus - 1);
                    System.out.println("Data telah dihapus");
                    break;

                case 4:
                    System.out.println("=====Show Data=====");
                    // Deklarasi Iterator untuk menampilkan isi dari LinkedList
                    Iterator<String> ite = link.iterator();
                    while (ite.hasNext()) {

                        System.out.print(ite.next() + ", ");
                    } // Looping untuk menampilkan isi dari LinkedList
                    System.out.println();
                    break;

                case 5:
                    System.out.println("=====Input Data Pertama=====");
                    System.out.print("Masukkan data: ");
                    // Menginputkan data
                    String awal = scan.readLine();
                    // Memasukkan data ke LinkedList pada index ke 0 atau urutan pertama
                    link.addFirst(awal);
                    break;

                case 6:
                    System.out.println("=====Input Data Terakhir=====");
                    System.out.print("Masukkan data: ");
                    // Menginputkan data
                    String akhir = scan.readLine();
                    // Memasukkan data ke LinkedList pada index atau urutan terakhir
                    link.addFirst(akhir);
                    break;

                case 7:
                    // Menu untuk keluar dari program
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }
}
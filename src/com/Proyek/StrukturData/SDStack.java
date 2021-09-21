package com.Proyek.StrukturData;

// import untuk dapat menggunakan Stack dan Scanner
import java.util.*;

public class SDStack {

    public static void main(String[] args) {

        // Deklarasi Stack bertipe data Integer
        Stack<Integer> list = new Stack<Integer>();
        // Deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        // Menginputkan panjang Stack
        System.out.print("Masukkan panjang data: ");
        int panjang = scan.nextInt();
        // menampilkan panjang Stack
        System.out.println("Panjang Stack: " + panjang);
        System.out.println("");

        // Looping untuk Menu
        while (true) {

            Menu(); // Memanggil tampilan menu
            // Menginputkan pilihan menu
            System.out.print("Masukkan menu pilihan: ");
            int pilih = scan.nextInt();
            System.out.println("");

            switch (pilih) {

                case 1:
                    // Memanggil prosedur Tambah
                    Tambah(list, scan, panjang);
                    break;

                case 2:
                    // Memanggil prosedur Hapus
                    Hapus(list);
                    break;

                case 3:
                    // Memanggil prosedur Clear
                    Clear(list);
                    break;

                case 4:
                    // Memanggil prosedur Get
                    Get(list);
                    break;

                case 5:
                    // Menu untuk keluar dari program
                    System.exit(0);
                    break;
            }
        }

    }

    private static void Menu() {

        // Membuat tampilan menu
        System.out.println("=====Menu=====");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Hapus Semua Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar");
    }

    private static void Tambah(Stack<Integer> list, Scanner scan, int panjang) {

        // If else untuk mengetahui apakah isi Stack sudah penuh atau belum
        if (list.size() == panjang) {

            System.out.println("Stack sudah penuh");

        } else {

            // Menginputkan data pada Stack
            System.out.print("Masukkan data: ");
            list.push(scan.nextInt());
        }

        System.out.println("");
    }

    private static void Hapus(Stack<Integer> list) {

        // If else untuk mengetahui apakah isi Stack kosong atau tidak
        if (list.isEmpty()) {

            System.out.println("Data kosong");

        } else {

            // Menampilkan dan menghapus isi Stack menggunakan operator pop()
            System.out.println("Hapus data: " + list.pop());
        }

        System.out.println("");
    }

    private static void Clear(Stack<Integer> list) {

        // Menghapus semua isi Stack menggunakan operator clear()
        System.out.println("Menghapus semua data");
        list.clear();
        System.out.println("");
    }

    private static void Get(Stack<Integer> list) {

        // If else untuk mengetahui apakah isi Stack kosong atau tidak
        if (list.isEmpty()) {

            System.out.println("Data kosong");

        } else {

            // Menampilkan isi Stack paling atas atau awal
            System.out.println("Data paling atas: " + list.peek());
            // Menampilkan panjang Stack
            System.out.println("Ukuran Stack: " + list.size());

            // Looping untuk menampilkan semua isi Stack
            for (int i = 0; i < list.size(); i++) {

                // Menampilkan isi Stack menggunakan operator elementAt()
                System.out.print(list.elementAt(i) + ", ");
            }
        }
        System.out.println("");
    }
}

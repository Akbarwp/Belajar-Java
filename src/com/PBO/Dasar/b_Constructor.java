package com.PBO.Dasar;

// Class tanpa Constuctor
class Polos {

    String dataString;
    int angka;
}

// Class dengan Constructor
class Siswa {

    String nama;
    int absen;
    String jurusan;

    // Constructor
    // Siswa() {
    // System.out.println("Hai Constructor");
    // }

    // Constructor dengan parameter
    Siswa(String inputNama, int inputAbsen, String inputjurusan) {
        nama = inputNama;
        absen = inputAbsen;
        jurusan = inputjurusan;
    }
}

public class b_Constructor {

    public static void main(String[] args) {

        Polos polo = new Polos();
        polo.dataString = "Hello World";

        Siswa Siswa1 = new Siswa("Budi", 2, "IPA");
        System.out.println(Siswa1.nama);
        System.out.println(Siswa1.absen);
        System.out.println(Siswa1.jurusan);
    }
}

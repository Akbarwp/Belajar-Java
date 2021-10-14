package com.PBO.Dasar;

// Membuat template atau class
class Mahasiswa {

    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class a_ClassObject {

    public static void main(String[] args) {

        // Instansiasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa1.nama = "Akbar";
        mahasiswa1.NIM = "123";
        mahasiswa1.jurusan = "S1 Sistem Informasi";
        mahasiswa1.IPK = 3.92;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        System.out.println();

        mahasiswa2.nama = "Wibowo";
        mahasiswa2.NIM = "124";
        mahasiswa2.jurusan = "S1 Informatika";
        mahasiswa2.IPK = 3.83;
        mahasiswa2.umur = 20;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}

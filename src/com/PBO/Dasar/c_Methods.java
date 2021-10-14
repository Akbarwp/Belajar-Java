package com.PBO.Dasar;

class Hewan {

    // Data
    String nama;
    String jenis;

    // Contructor
    Hewan(String nama, String jenis) {

        this.nama = nama;
        this.jenis = jenis;
    }

    // Method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jenis: " + this.jenis);
    }

    // Method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return dan tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getJenis() {
        return this.jenis;
    }

    // Method dengan return dan dengan parameter
    String sayHi(String salam) {
        return salam + ", aku adalah " + this.nama;
    }
}

public class c_Methods {

    public static void main(String[] args) {

        Hewan hewan1 = new Hewan("Sapi", "Mamalia");

        hewan1.show();

        hewan1.setNama("Kambing");
        hewan1.show();

        System.out.println(hewan1.getNama());
        System.out.println(hewan1.getJenis());

        String hi = hewan1.sayHi("Hai");
        System.out.println(hi);
    }
}

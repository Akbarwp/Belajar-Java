package com.PBO.Dasar;

abstract class Lokasi {
    String nama;

    abstract void berada(String pulau);
}

class Kota extends Lokasi {

    void berada(String pulau) {
        System.out.println("Kota ini berada di Pulau " + pulau);
    }
}

public class n_AbstractClass {
    public static void main(String[] args) {

        // Lokasi lokasi = new Lokasi(); // Error karena Lokasi merupakan abstract class

        Lokasi kota1 = new Kota();
        kota1.nama = "Sidoarjo";
        System.out.println(kota1.nama);
        kota1.berada("Jawa");
    }
}
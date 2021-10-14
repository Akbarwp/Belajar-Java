package com.PBO.Dasar;

class Pembeli {

    private String nama;
    private String nik;
    private int harga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIK(String nik) {
        this.nik = nik;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNIK() {
        return this.nik;
    }

    public int getHarga() {
        return this.harga;
    }

    void vaksin() {
        System.out.println("Saya sudah vaksin");
        int diskon = getHarga() * 15 / 100;
        setHarga(getHarga() - diskon);
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // getter
    public double getJari2() {
        return this.diameter / 2;
    }

    // getter
    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }
}

public class f_GetterSetter {

    public static void main(String[] args) {

        Pembeli mhs = new Pembeli();

        mhs.setNama("Akbar");
        mhs.setNIK("351518");
        mhs.setHarga(10000);

        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIK: " + mhs.getNIK());
        System.out.println("Harga: Rp" + mhs.getHarga());

        System.out.println("");
        mhs.vaksin();

        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIK: " + mhs.getNIK());
        System.out.println("Harga: Rp" + mhs.getHarga());

        // gabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("jari-jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("jari-jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());
    }

}
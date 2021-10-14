package com.PBO.Dasar;

class Weapon {
    String nama;

    Weapon(String nama) {
        this.nama = nama;
    }

    void show() {
        System.out.println("\nNama \t: " + this.nama);
    }
}

class Sword extends Weapon {
    String tipe = "Pedang";

    Sword(String nama) {
        super(nama);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Jenis \t: " + this.tipe);
    }
}

class Bow extends Weapon {
    String tipe = "Panah";

    Bow(String nama) {
        super(nama);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Jenis \t: " + this.tipe);
    }

    void komen() {
        System.out.println("Aku adalah panah ajaib");
    }
}

public class k_Polymorphism {
    public static void main(String[] args) {

        Weapon wp1 = new Weapon("Agista");

        // Polymorphism
        Weapon wp2 = new Sword("Zhao Yun");

        Bow wp3 = new Bow("Krisna");

        wp1.show();
        wp2.show();
        wp3.show();
        wp3.komen();

        // Array List
        Weapon[] kumpul = new Weapon[3];
        kumpul[0] = wp1;
        kumpul[1] = wp2;
        kumpul[2] = wp3;

        kumpul[0].show();
        kumpul[1].show();
        kumpul[2].show();

        // Tidak bisa karena sudah tercasting pada Array List Weapon
        // kumpul[2].komen(); -- Casting
    }
}
package com.PBO.Dasar;

// Superclass, Parent class, Base class
class Monitor {

    String nama;
    String tipe = "24G2E5";

    Monitor(String nama) {
        this.nama = nama;
    }

    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Tipe: " + this.tipe);
    }

    void tes() {
        System.out.println("Method ini ada di Superclass");
    }
}

// Sub class, Child class, Derived class
class monitorLayar extends Monitor {

    // Overriding Method
    void show() {
        System.out.println("\nPanel Layar: " + this.nama);
        System.out.println("Ukuran Layar: " + this.tipe);
    }

    // Subclass Contructor
    monitorLayar(String nama) {
        super(nama);
    }
}

// Sub class, Child class, Derived class
class monitorWarna extends Monitor {

    String tipe = "#000000";

    // Subclass Contructor
    monitorWarna(String nama) {
        super(nama);
    }

    // Overriding Method
    void show() {

        // this.tipe akan mengakses atribut tipe kalau ada di kelas ini.
        // jika tidak ada maka akan mengkases atribut tipe dari superclass.

        // super.tipe akan selalu mengakses atribut superclass
        System.out.println("\nWarna Body: " + this.nama);
        System.out.println("Tipe Body: " + this.tipe);
        this.tes();
    }

    void showSuper() {
        System.out.println("\nTipe Body: " + super.tipe);
        super.tes();
    }

    void tes() {
        System.out.println("Method ini ada di Sub class");
    }
}

public class j_Inheritance {
    public static void main(String[] args) {

        Monitor mon = new Monitor("AOC");
        mon.nama = "AOC";

        monitorLayar monS = new monitorLayar("IPS");
        monS.nama = "IPS";
        monS.tipe = "23.5 inch";

        monitorWarna monW = new monitorWarna("Hitam-Merah");
        monW.nama = "Hitam-Merah";

        mon.show();
        monS.show();
        monW.show();
        monW.showSuper();
    }
}

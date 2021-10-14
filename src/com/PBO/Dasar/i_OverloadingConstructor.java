package com.PBO.Dasar;

class Keyboard {

    private String nama;
    private static int jml;

    Keyboard(String nama) {
        Keyboard.jml++;
        this.nama = nama;
    }

    Keyboard() {
        Keyboard.jml++;
        this.nama = "Keyboard " + Keyboard.jml;
    }

    void show() {
        System.out.println("Nama: " + this.nama);
    }
}

public class i_OverloadingConstructor {
    public static void main(String[] args) {

        Keyboard key1 = new Keyboard("Rexus");
        Keyboard key2 = new Keyboard();
        Keyboard key3 = new Keyboard();
        Keyboard key4 = new Keyboard("Logitech");

        key1.show();
        key2.show();
        key3.show();
        key4.show();

    }
}

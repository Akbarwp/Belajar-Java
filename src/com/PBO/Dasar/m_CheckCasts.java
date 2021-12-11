package com.PBO.Dasar;

class Mouse {
    String nama;

    Mouse(String nama) {
        this.nama = nama;
    }

    void show(String merk) {
        System.out.println("Ini adalah tetikus " + this.nama + " bermerek " + merk);
    }

}

class MouseGaming extends Mouse {
    String nama;

    MouseGaming(String nama) {
        super(nama);
    }

}

class MouseOffice extends Mouse {
    String nama;

    MouseOffice(String nama) {
        super(nama);
    }

}

public class m_CheckCasts {
    public static void main(String[] args) {

        Mouse ms = new Mouse("Daxa");
        ms.show("Rexus");

        ms = new MouseGaming("G300s");
        ms.show("Logitech");

        ms = new MouseOffice("Silent Office");
        ms.show("HP");

        System.out.println();

        hello(new Mouse("Daxa"));
        hello(new MouseGaming("G300s"));
        hello(new MouseOffice("Silent Office"));

    }

    static void hello(Mouse mouse) {
        if (mouse instanceof MouseGaming) {
            MouseGaming gaming = (MouseGaming) mouse;
            System.out.println("Ini adalah tetikus gaming " + gaming.nama);
        } else if (mouse instanceof MouseOffice) {
            MouseOffice office = (MouseOffice) mouse;
            System.out.println("Ini adalah tetikus office " + office.nama);
        } else {
            System.out.println("Ini adalah tetikus " + mouse.nama);
        }
    }

}

package com.Tugas;

public class ClassMath {

    public static void main(String[] args) {

        int x, y;
        double a, b, r;

        x = -10;
        y = -15;
        System.out.println("Hasil dari |" + x + "| + |" + y + "| adalah " + Math.abs(hasil1(x, y)));

        System.out.println("");

        a = 5;
        b = 2;
        System.out.println("Hasil dari " + a + " / " + b + " adalah " + (hasil1(a, b)));
        System.out.println("Dibulatkan menjadi " + Math.round(hasil1(a, b)));

        System.out.println("");

        x = 10;
        y = 100;
        Max(x, y);

        x = 10;
        y = 100;
        Min(x, y);

        r = 7;
        System.out.println("Luas lingkaran dengan jari-jari " + r + " yaitu " + hasil1(r));

    }

    private static int hasil1(int x, int y) {

        return (x + y);
    }

    private static double hasil1(double a, double b) {

        return (a / b);
    }

    private static double hasil1(double r) {

        return (Math.PI * Math.pow(r, 2));
    }

    private static void Max(int x, int y) {

        System.out.println("Membandingkan nilai terbesar dari x = " + x + " dengan y = " + y);
        System.out.println("Nilai terbesar yaitu " + Math.max(x, y));
        System.out.println("");
    }

    private static void Min(int x, int y) {

        System.out.println("Membandingkan nilai terkecil dari x = " + x + " dengan y = " + y);
        System.out.println("Nilai terbesar yaitu " + Math.min(x, y));
        System.out.println("");
    }
}

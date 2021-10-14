package com.PBO.Dasar;

class Hitung {

    static int kali(int x, int y) {
        return x * y;
    }

    static double kali(int x, double y) {
        return (double) x * y;
    }

    static double kali(double x, int y) {
        return (double) x * y;
    }
}

public class i_OverloadingMethod {
    public static void main(String[] args) {

        System.out.println(Hitung.kali(3, 5));
        System.out.println(Hitung.kali(3, 5.5));
        System.out.println(Hitung.kali(3.5, 5));
    }
}

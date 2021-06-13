package com.PemrogramanDasar;

public class i_OverloadMethod {

    public static void main(String[] args) {

        printAngka(10);
        printAngka(20.5f);
        printAngka(30.5d);

        System.out.println("");

        int hasilInteger;
        hasilInteger = hitung(10, 20, 30);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = hitung(10.5f, 20.5f, 30.5f);
        printAngka(hasilFloat);

    }

    private static void printAngka(int angkaInt) {

        System.out.println("Ini adalah angka Integer = " + angkaInt);
    }

    private static void printAngka(float angkaFloat) {

        System.out.println("Ini adalah angka Float = " + angkaFloat);
    }

    private static void printAngka(Double angkaDouble) {

        System.out.println("Ini adalah angka Double = " + angkaDouble);
    }

    private static int hitung(int angkaInt1, int angkaInt2, int angkaInt3) {

        return angkaInt1 + angkaInt2 + angkaInt3;
    }

    private static float hitung(float angkaFloat1, float angkaFloat2, float angkaFloat3) {

        return angkaFloat1 + angkaFloat2 + angkaFloat3;
    }

}

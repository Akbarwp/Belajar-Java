package com.PemrogramanDasar;

public class i_MethodRekursif {

    public static void main(String[] args) {

        int x = 5;

        printNilai(x);
        System.out.println("");

        int jumlah = jumlahNilai(x);
        System.out.println("Hasil penjumlahan = " + jumlah);

        int kali = kaliNilai(x);
        System.out.println("Hasil penjumlahan = " + kali);
        System.out.println("");

    }

    private static void printNilai(int parameter) {

        System.out.println("Nilai = " + parameter);

        if (parameter == 0) {

            return;
        }
        parameter--;
        printNilai(parameter);
    }

    private static int jumlahNilai(int parameter) {

        System.out.println("Parameter = " + parameter);

        if (parameter == 0) {

            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static int kaliNilai(int parameter) {

        if (parameter == 1) {

            return parameter;
        }

        return parameter * kaliNilai(parameter - 1);
    }
}

package com.Tugas.Search;

import java.util.*;

public class HashtableSearch {

    public static void main(String[] args) {

        // Panjang Array = Banyak kata pada nama panjang = 16

        Scanner scan = new Scanner(System.in);
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();

        // (key, Array)
        ht1.put(58, 2);
        ht1.put(46, 3);
        ht1.put(53, 5);
        ht1.put(56, 7);
        ht1.put(1, 11);
        ht1.put(69, 13);
        ht1.put(5, 17);
        ht1.put(15, 19);
        ht1.put(6, 23);
        ht1.put(10, 29);
        ht1.put(61, 31);
        ht1.put(33, 37);
        ht1.put(2, 41);
        ht1.put(21, 43);
        ht1.put(12, 47);
        ht1.put(6, 53);

        int cari;

        System.out.print("Masukkan kunci data: ");
        cari = scan.nextInt();

        if (ht1.containsKey(cari)) {

            int a = ht1.get(cari);
            System.out.println("Angka pada kunci data tersebut yaitu: " + a);
        }

    }

}

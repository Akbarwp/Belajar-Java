package com.BoJ;

import java.util.*;

public class BoJ3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kata/kalimat: ");
        String kata = scan.next();

        String kata2 = kata.toUpperCase();
        System.out.println("Kata/kalimat yang baru: " + kata2);
    }

}

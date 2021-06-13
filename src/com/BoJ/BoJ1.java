package com.BoJ;

import java.util.*;

public class BoJ1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata dengan panjang 5 huruf: ");
        String kata = scan.next();
        char huruf = kata.charAt(2);
        System.out.println("Karakter yang berada di posisi tengah adalah: \"" + huruf + "\"");
    }
}

package com.PemrogramanDasar;

import java.util.Scanner;

public class c_Aritmatika {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan x = ");
        int x = Input.nextInt();

        System.out.print("Masukkan y = ");
        int y = Input.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (float) x / y);
        System.out.println("x % y = " + (x % y));

    }
}
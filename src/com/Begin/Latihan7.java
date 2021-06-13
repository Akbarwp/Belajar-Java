package com.Begin;

public class Latihan7 {

    public static void main(String[] args) {

        for (int x = 1; x <= 50; x += x) {

            System.out.println(x);
        }

        int y = 1;
        while (y <= 10) {

            System.out.println(y);
            y++;
        }

        int z = 1;
        do {
            System.out.println(z);
            z += 2;
        } while (z <= 10);
    }

}

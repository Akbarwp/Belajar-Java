package com.BoJ;

import java.util.*;

public class BOJ4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Hasil: ");
        int bat = scan.nextInt();

        for (int i = 1; i <= bat; i++) {

            if ((i + 1) <= bat) {

                System.out.print(i + ", ");
            } else {

                System.out.print(i + " ");
            }

        }

    }
}

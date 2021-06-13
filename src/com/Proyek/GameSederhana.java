package com.Proyek;

import java.util.*;

public class GameSederhana {

    public static void main(String[] args) {

        int x, y, hasil, tebak, life, benar;
        int jenis;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        do {

            benar = 0;
            life = 3;
            System.out.println("=====Game Kalkulator=====");
            System.out.println("");

            System.out.println("===Menu===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Keluar");

            System.out.print("Silakan pilih jenis operasi matematika = ");
            jenis = scan.nextInt();

            System.out.println("");

            switch (jenis) {

                case 1:
                    System.out.println("=====Penjumlahan=====");

                    while (life > 0) {

                        System.out.println("life: " + life + "     Score: " + benar);
                        System.out.println("");

                        x = random.nextInt(10);
                        y = random.nextInt(10);
                        hasil = x + y;

                        System.out.print(x + " + " + y + " = ");
                        tebak = scan.nextInt();

                        if (tebak == hasil) {

                            System.out.println("Benar");
                            benar += 1;
                        } else {

                            System.out.println("salah");
                            life -= 1;
                        }
                        System.out.println("");
                    }

                    System.out.println("Game Over");
                    System.out.println("Score Anda: " + benar);

                    break;

                case 2:

                    System.out.println("=====Pengurangan=====");

                    while (life > 0) {

                        System.out.println("life: " + life + "     Score: " + benar);
                        System.out.println("");

                        x = random.nextInt(10);
                        y = random.nextInt(10);
                        hasil = x - y;

                        System.out.print(x + " - " + y + " = ");
                        tebak = scan.nextInt();

                        if (tebak == hasil) {

                            System.out.println("Benar");
                            benar += 1;
                        } else {

                            System.out.println("salah");
                            life -= 1;
                        }
                        System.out.println("");
                    }

                    System.out.println("Game Over");
                    System.out.println("Score Anda: " + benar);

                    break;

                case 3:

                    System.out.println("=====Perkalian=====");

                    while (life > 0) {

                        System.out.println("life: " + life + "     Score: " + benar);
                        System.out.println("");

                        x = random.nextInt(10);
                        y = random.nextInt(10);
                        hasil = x * y;

                        System.out.print(x + " * " + y + " = ");
                        tebak = scan.nextInt();

                        if (tebak == hasil) {

                            System.out.println("Benar");
                            benar += 1;
                        } else {

                            System.out.println("salah");
                            life -= 1;
                        }
                        System.out.println("");
                    }

                    System.out.println("Game Over");
                    System.out.println("Score Anda: " + benar);

                    break;

                default:

                    System.out.println("Terima kasih telah bermain");

            }
        } while (life == 0);

    }
}

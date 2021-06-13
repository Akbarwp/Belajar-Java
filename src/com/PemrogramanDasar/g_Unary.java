package com.PemrogramanDasar;

public class g_Unary {

    public static void main(String[] args) {

        // Unary adalah operasi yang dilakukan pada satu variabel

        // Unary + dan -

        int a = 5;
        System.out.printf("Unary '+' membuat %d menjadi %d\n", a, +a);
        System.out.printf("Unary '-' membuat %d menjadi %d\n", a, -a);

        // Unary increment dan decrement

        int b = 10;
        b++;
        System.out.println("Unary '++' membuat b menjadi" + b);
        int c = 10;
        c--;
        System.out.println("Unary '--' membuat c menjadi" + c);

        int d = 15;
        System.out.printf("Unary prefix membuat %d menjadi %d\n", d, ++d);
        System.out.printf("Unary postfix membuat %d menjadi %d\n", d, d++);

        // Unary ! pada Boolean

        boolean e = true;
        System.out.println("Unary '!' membuat e menjadi " + !e);

    }
}
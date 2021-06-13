package com.PemrogramanDasar;

public class g_Logika {

    public static void main(String[] args) {

        boolean a, b, c;

        // ===== OR (||) =====

        System.out.println("===== OR (||) =====");

        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        System.out.println("");

        // ===== AND (&&) =====

        System.out.println("===== AND (&&) =====");

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        System.out.println("");

        // ===== XOR (^) Exclusive Or =====

        System.out.println("===== XOR (^) =====");

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println("");

        // ===== Negasi (!) Flipping =====

        System.out.println("===== Negasi (!) =====");

        a = true;
        c = (!a);
        System.out.println("Negasi " + a + " = " + c);

        a = false;
        c = (!a);
        System.out.println("Negasi " + a + " = " + c);

    }
}

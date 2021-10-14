package com.PBO.Dasar;

import java.util.ArrayList;

class Bapak {

    private static int numberOfBapak;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Bapak(String name) {
        this.name = name;
        Bapak.numberOfBapak++;
        Bapak.nameList.add(this.name);
    }

    void show() {
        System.out.println("Bapak name = " + this.name);
    }

    // static method
    static void showNumberOfBapak() {
        System.out.println("Number of Bapak = " + Bapak.numberOfBapak);
    }

    static ArrayList<String> getNames() {
        return Bapak.nameList;
    }

}

class g_StaticClassMethod {
    public static void main(String[] args) {
        Bapak Bapak1 = new Bapak("Saitama");
        Bapak Bapak2 = new Bapak("All Mighty");
        Bapak Bapak3 = new Bapak("Midnight");
        Bapak Bapak4 = new Bapak("Mt Lady");

        Bapak.showNumberOfBapak();

        System.out.println("Names = " + Bapak.getNames());
        // System.out.println("Names = " + Bapak1.getNames()); // ini bisa dilakukan

    }
}
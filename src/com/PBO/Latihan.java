package com.PBO;

import java.io.*;
import java.util.*;

// Player
class Orang {
    String name;
    double health;
    int level;

    // Object
    Senjata weapon;
    Baju armor;

    Orang(String name, double health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    void status() {
        System.out.println("\nNama : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        System.out.println("Level : " + this.level);
        this.weapon.display();
        this.armor.display();
    }

    void leveling(int level) {
        this.level = level;
    }

    void equipWeapon(Senjata weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Baju armor) {
        this.armor = armor;
    }

    void attack(Orang opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower) {
        // Akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }
}

// Weapon
class Senjata {
    String name;
    double attackPower;

    Senjata(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Senjata : " + this.name + ", Attack Power : " + this.attackPower);
    }
}

// Armor
class Baju {
    String name;
    double defencePower;

    Baju(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Baju : " + this.name + ", Defence Power : " + this.defencePower);
    }
}

public class Latihan {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Membuat object player
        Orang Orang1 = new Orang("Udin", 100, 1);
        Orang Orang2 = new Orang("Budi", 75, 1);

        // Membuat object weapon
        Senjata weapon1 = new Senjata("Katana", 21);
        Senjata weapon2 = new Senjata("Panah", 30);

        // Membuat object armor
        Baju armor1 = new Baju("Zirah", 20);
        Baju armor2 = new Baju("Kaos", 10);

        // Equip senjata dan armor
        Orang1.equipWeapon(weapon1);
        Orang1.equipArmor(armor1);
        Orang1.status();

        Orang2.equipWeapon(weapon2);
        Orang2.equipArmor(armor2);
        Orang2.status();

        System.out.println("\n===== PERTEMPURAN =====");

        int i = 1;
        while (Orang1.health >= 0 && Orang2.health >= 0) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Status Player");
            System.out.println("2. Player1 attack Player2");
            System.out.println("3. Player2 attack Player1");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan: ");
            int pilih = Integer.parseInt(scan.nextLine());
            System.out.println("\n~Episode " + i + "~\n");
            i += 1;
            switch (pilih) {

                case 1:
                    Orang1.status();
                    Orang2.status();
                    break;

                case 2:
                    Orang1.attack(Orang2);
                    break;

                case 3:
                    Orang2.attack(Orang1);
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
        System.out.println("\n===== Game Over =====");
        if (Orang1.health > 0) {
            System.out.println(Orang1.name + " Win");
            Orang1.leveling(Orang1.level + 1);
            Orang1.status();
        } else {
            System.out.println(Orang2.name + " Win");
            Orang2.leveling(Orang2.level + 1);
            Orang2.status();
        }
    }
}

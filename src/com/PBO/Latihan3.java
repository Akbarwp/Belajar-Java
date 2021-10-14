package com.PBO;

class Hero {

    String name;
    double attackPower;
    double Health;

    Hero(String name, double attackPower, double Health) {
        this.name = name;
        this.attackPower = attackPower;
        this.Health = Health;
    }

    void show() {
        System.out.println("\nNama: " + this.name);
        System.out.println("Attack Power: " + this.attackPower);
        System.out.println("Health: " + this.Health);
    }

    void attack(Hero enemy) {
        System.out.println("\n" + this.name + " menyerang " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage) {
        System.out.println(this.name + " menerima serangan " + damage);
        this.Health = this.Health - damage;
    }
}

class HeroStrength extends Hero {

    String tipe = "Tank";

    HeroStrength(String name, double attackPower, double Health) {
        super(name, attackPower, Health);
    }

    @Override
    void show() {
        super.show();
        System.out.println("Tipe: " + this.tipe);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " menerima serangan " + damage + " --> " + damage * 0.5);
        this.Health = this.Health - damage * 0.5;
    }
}

public class Latihan3 {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Sukijan", 10, 100);
        HeroStrength hero2 = new HeroStrength("Susi", 20, 100);

        hero1.show();
        hero2.show();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.show();
        hero2.show();

    }
}

package com.PBO.Dasar;

class Hero {
    public String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // getter
    public double getHealth() {
        return this.health;
    }

    // setter
    final void setHealth(double newHealth) {
        this.health = newHealth;
    }

    // bisa di overload
    void setHealth(String mode) {
        if (mode.equals("reset")) {
            this.health = 100;
        }
    }

    public void display() {
        System.out.println(this.name + " mempunyai " + this.health);
    }

}

class IntelHero extends Hero {

    IntelHero(String name, double health) {
        super(name, health);
        // System.out.println(this.health); tidak bisa diakses karena private
    }

    // visibility harus sama dengan superclass
    public void display() {
        System.out.println(this.name + " mempunyai banyak " + this.getHealth());
    }

    // kita coba override final setter, tidak bisa dilakukan
    // void setHealth(double newHealth){
    // System.out.println("mencoba memasukan health = " + newHealth);
    // }

    // ini bisa dilakukan
    void setHealth(String newHealth) {
        System.out.println("mencoba memasukan health = " + newHealth);
    }
}

// visibility
// 1. Public: Jika method atau attribute dalam public secara explisit,
// maka subclass tidak boleh mengurangi visibility
// 2. Private: Jika method atau attribute dalam private secara explisit,
// maka subclass pun tidak dapat mengakses
// 3. Final: method atau attribute dengan final keyword akan diwariskan,
// tetapi tidak bisa dioverride. dalam class yang sama bisa dioverload

public class l_FinalKeyword {
    public static void main(String[] args) {

        System.out.println("test");

        Hero hero1 = new Hero("ucup", 100);
        IntelHero hero2 = new IntelHero("otong", 50);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(120);
        hero2.setHealth(80);

        hero1.display();
        hero2.display();

        hero1.setHealth("reset");
        hero1.display();

        hero2.setHealth("reset");
        hero2.display();
    }
}
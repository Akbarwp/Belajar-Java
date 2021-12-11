package com.PBO.Dasar;

interface Mobil extends Brand {

    int getKecepatan();

    void berjalan();
}

interface Brand {
    String getBrand();
}

interface Assembly {
    String getPabrik();
}

class Tesla implements Mobil {

    String brand;
    int speed;

    Tesla(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public int getKecepatan() {
        return this.speed;
    }

    public void berjalan() {
        System.out.println("Mobil sedang berjalan");
    }

    public String getBrand() {
        return this.brand;
    }
}

class Kijang implements Assembly, Brand {

    String brand, assembly;

    Kijang(String brand, String assembly) {
        this.brand = brand;
        this.assembly = assembly;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getPabrik() {
        return this.assembly;
    }
}

public class o_InterfaceClass {
    public static void main(String[] args) {

        Mobil mb1 = new Tesla("Tesla", 100);

        mb1.berjalan();
        System.out.println("Kecepatan mobil: " + mb1.getKecepatan() + " km/j");

        Kijang mb2 = new Kijang("Inova", "Indonesia");
        System.out.println("Mobil ini merupakan brand dari " + mb2.getBrand());
        System.out.println("Mobil ini dirakit di " + mb2.getPabrik());
    }
}

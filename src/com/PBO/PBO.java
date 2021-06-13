package com.PBO;

public class PBO {

    public static void main(String[] args) {

        Person person1 = new Person("Akbar", "Wibowo", "Putra", 20, 1.71, 66, "Mahasiswa");
        person1.printData();

        System.out.println("----------------");

        person1.setJob("Pelajar");
        System.out.println("Telah merubah `job` dari `person1` menjadi " + person1.getJob() + ".");

        person1.printData();

    }
}
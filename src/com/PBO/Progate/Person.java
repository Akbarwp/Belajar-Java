package com.PBO.Progate;

public class Person {

    private static int count;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height, weight;
    private String job;

    Person(String firstName, String lastName, int age, double height, double weight, String job) {

        Person.count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.job = job;
    }

    Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {

        this(firstName, lastName, age, height, weight, job);
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getJob() {
        return this.job;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String fullName() {

        if (this.middleName == null) {
            return this.firstName + " " + this.lastName;
        } else {
            return this.firstName + " " + this.middleName + " " + this.lastName;
        }
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public static void count() {
        System.out.println("Total: " + Person.count + " orang.");
    }

    public void printData() {

        System.out.println("Nama saya adalah " + this.fullName() + ".");
        System.out.println("Saya berusia " + this.age + " tahun.");
        System.out.println("Nilai BMI saya " + Math.round(this.bmi()) + ".");
        System.out.println("Saya adalah seorang " + this.job + ".");
    }

}

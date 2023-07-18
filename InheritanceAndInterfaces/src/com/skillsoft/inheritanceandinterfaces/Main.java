package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Automobile huracan = new Lamborghini("Huracan", 78000.0, 320);
        SportsCar aventador = new Lamborghini("Aventador", 127000.0, 350);

        System.out.println("Huracan: " + huracan);
        System.out.println("Aventador: " + aventador);

        System.out.println("\nHuracan is an instance of Lamborghini: " + (huracan instanceof Lamborghini));
        System.out.println("Huracan is an instance of SportsCar: " + (huracan instanceof SportsCar));
        System.out.println("Huracan is an instance of Automobile: " + (huracan instanceof Automobile));

        System.out.println("\nAventador is an instance of Lamborghini: " + (aventador instanceof Lamborghini));
        System.out.println("Aventador is an instance of SportsCar: " + (aventador instanceof SportsCar));
        System.out.println("Aventador is an instance of Automobile: " + (aventador instanceof Automobile));
    }
}
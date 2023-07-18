package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Automobile huracan = new Lamborghini("Huracan", 78000.0, 320);

        System.out.println("Huracan: " + huracan);
        System.out.println("Huracan release date: " + huracan.getReleaseDate());
    }
}
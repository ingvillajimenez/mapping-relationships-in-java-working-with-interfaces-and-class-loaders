package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

//        Automobile automobile = new Automobile();

//        Sedan sedan = new Sedan();

//        Sedan sedan = new Sedan("Honda", "Civic", 21000.0);

        Automobile sedan = new Sedan("Honda", "Civic", 21000.0);

        System.out.println("Sedan make: " + sedan.getMake());
        System.out.println("Sedan model: " + sedan.getModel());
        System.out.println("Sedan price: " + sedan.getPrice());

        System.out.println("Sedan: " + sedan);

        System.out.println("sedan is an instance of Sedan: " + (sedan instanceof Sedan));
        System.out.println("sedan is an instance of Automobile: " + (sedan instanceof Automobile));
    }
}
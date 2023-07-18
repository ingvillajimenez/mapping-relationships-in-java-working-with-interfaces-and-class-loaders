package com.skillsoft.inheritanceandinterfaces;

//public class Sedan implements Automobile {
public class Sedan extends ConceptCar {

//    private String make;
//    private String model;
    private Double price;

    public Sedan(String make, String model, Double price) {
        super(make, model);
//        this.make = make;
//        this.model = model;
        this.price = price;
    }

//    @Override
//    public String getMake() {
//        return make;
//    }

//    @Override
//    public String getModel() {
//    private String getModel() {
//    protected String getModel() {
//    String getModel() {
//        return model;
//    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getReleaseDate() {
        return Automobile.getFormattedCalendarString();
    }

    @Override
    public String toString() {
        return String.format("Make: %s, Model: %s, Price: %s", getMake(), getModel(), price);
    }
}

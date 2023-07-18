package com.skillsoft.inheritanceandinterfaces;

public abstract class ConceptCar implements Automobile {

    private String make;
    private String model;

    public ConceptCar(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    // NOTE: This method is not implemented for ConceptCar
    @Override
    public abstract Double getPrice();

    // NOTE: This method is not implemented for ConceptCar
    // It was a default method in the interface, but we've made it abstract once again
    // This means that this *has* to be implemented by the derived class
    @Override
    public abstract String getReleaseDate();
}

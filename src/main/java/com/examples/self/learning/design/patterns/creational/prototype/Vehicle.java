package com.examples.self.learning.design.patterns.creational.prototype;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    public Vehicle(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    protected Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public abstract Vehicle clone();

    @Override
    public String toString() {
        return brand + " " + model +" " + color;
    }
}

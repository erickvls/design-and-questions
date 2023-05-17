package com.examples.self.learning.design.patterns.creational.prototype;

public class Car extends Vehicle{
    private int topSpeed;

    public Car(String brand, String model, String color, int topSpeed){
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    private Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}

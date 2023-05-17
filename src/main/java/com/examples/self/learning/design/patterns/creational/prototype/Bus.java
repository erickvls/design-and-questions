package com.examples.self.learning.design.patterns.creational.prototype;

public class Bus extends Vehicle{
    private int doors;

    public Bus(String brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    private Bus(Bus bus){
        super(bus);
        this.doors = bus.doors;
    }
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}

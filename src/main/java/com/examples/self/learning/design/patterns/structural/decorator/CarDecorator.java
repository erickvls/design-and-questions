package com.examples.self.learning.design.patterns.structural.decorator;

public abstract class CarDecorator implements Car{

    private final Car car;
    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

package com.examples.self.learning.design.patterns.structural.decorator;

public class SportsCarDecorator extends CarDecorator{

    SportsCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with sports mode");
    }
}

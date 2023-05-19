package com.examples.self.learning.design.patterns.structural.decorator;

public class PaintDecorator extends CarDecorator{

    public PaintDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with paint mode.");
    }
}

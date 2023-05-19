package com.examples.self.learning.design.patterns.structural.decorator;

public class RealCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Creating real car");
    }
}

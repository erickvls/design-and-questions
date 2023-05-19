package com.examples.self.learning.design.patterns.structural.decorator;

public class ToyCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Creating a Toy car...");
    }
}

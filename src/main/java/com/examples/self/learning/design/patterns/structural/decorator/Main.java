package com.examples.self.learning.design.patterns.structural.decorator;

/**
 * See Problem.md and Readme.md
 */
public class Main {
    public static void main(String[] args) {
        // You can create a simple Real Car
        Car realCar = new RealCar();
        realCar.assemble();
        System.out.println("*****");

        // You can create a Sport Real car
        Car sportsCarDecorator = new SportsCarDecorator(new RealCar());
        sportsCarDecorator.assemble();
        System.out.println("*****");

        //
        Car luxurySportsCarPaintedToyCar = new PaintDecorator(new SportsCarDecorator(new LuxuryDecorator(new ToyCar())));
        luxurySportsCarPaintedToyCar.assemble();

    }
}

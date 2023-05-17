package com.examples.self.learning.design.patterns.creational.builder;

/**
 * Problem:
 * You need to construct many similar cars. See README, Builder image.
 * Reference video from: <a href="https://www.youtube.com/watch?v=QNpwWkdFvgQ&ab_channel=Geekific">Youtube Vídeo</a>
 */
public class Main{
    public static void main(String[] args) {
        Director director = new Director();

        Car.CarBuilder builder = new Car.CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.build();
        System.out.println(car.getCarType());

        CarManual.CarManualBuilder manualBuilder = new CarManual.CarManualBuilder();
        director.constructCityCar(manualBuilder);
        CarManual carManual = manualBuilder.build();
        System.out.println(carManual.getCarType());
    }
}

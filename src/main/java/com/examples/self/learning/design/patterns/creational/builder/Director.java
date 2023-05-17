package com.examples.self.learning.design.patterns.creational.builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.carType(CarType.SPORTS_CAR);
        builder.seats(2);
        builder.engine(new Engine(3.0, 0));
        builder.transmission(Transmission.SEMI_AUTOMATIC);
        builder.GPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.carType(CarType.CITY_CAR);
        builder.seats(2);
        builder.engine(new Engine(1.2, 0));
        builder.transmission(Transmission.AUTOMATIC);
        builder.GPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.carType(CarType.SUV);
        builder.seats(4);
        builder.engine(new Engine(2.5, 0));
        builder.transmission(Transmission.MANUAL);
        builder.GPSNavigator(new GPSNavigator());
    }
}

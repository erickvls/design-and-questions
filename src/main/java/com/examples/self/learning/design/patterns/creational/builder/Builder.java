package com.examples.self.learning.design.patterns.creational.builder;

public interface Builder {
    Builder carType(CarType type);
    Builder seats(int seats);
    Builder engine(Engine engine);
    Builder transmission(Transmission transmission);
    Builder GPSNavigator(GPSNavigator gpsNavigator);
}

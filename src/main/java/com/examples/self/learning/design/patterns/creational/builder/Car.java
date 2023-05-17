package com.examples.self.learning.design.patterns.creational.builder;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    Car(CarBuilder builder) {
        this.carType = builder.carType;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.gpsNavigator = builder.gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }


    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    static class CarBuilder implements Builder{

        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private GPSNavigator gpsNavigator;

        @Override
        public CarBuilder carType(CarType type) {
            this.carType = type;
            return this;
        }

        @Override
        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        @Override
        public CarBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public CarBuilder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        @Override
        public CarBuilder GPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }
}
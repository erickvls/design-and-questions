package com.examples.self.learning.design.patterns.creational.builder;

public class CarManual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;

    CarManual(CarManualBuilder builder) {
        this.carType = builder.carType;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.gpsNavigator = builder.gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
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

    static class CarManualBuilder implements Builder{

        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private GPSNavigator gpsNavigator;

        @Override
        public CarManualBuilder carType(CarType type) {
            this.carType = type;
            return this;
        }

        @Override
        public CarManualBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        @Override
        public CarManualBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public CarManualBuilder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        @Override
        public CarManualBuilder GPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarManual build(){
            return new CarManual(this);
        }

    }
}
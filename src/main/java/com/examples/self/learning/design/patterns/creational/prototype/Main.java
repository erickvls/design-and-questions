package com.examples.self.learning.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300),
                new Bus("bus_brand", "bus_model", "bus_color", 8)
        );

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }

        copyList.forEach(System.out::println);
    }
}

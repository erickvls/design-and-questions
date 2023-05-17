package com.examples.self.learning.design.patterns.creational.factory;


/**
 * See Factory image in README.md
 * This is the Concrete creator B
 */
class VeggieBurgerRestaurant extends RestaurantFactory{

    @Override
    public IBurger createBurger() {
        return new VeggieBurger();
    }
}




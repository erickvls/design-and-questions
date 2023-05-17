package com.examples.self.learning.design.patterns.creational.factory;

/**
 * See Factory image in README.md
 * This is the Concrete creator A
 */
class BeefBurgerRestaurant extends RestaurantFactory{
    @Override
    public IBurger createBurger() {
        return new BeefBurger();
    }
}
package com.examples.self.learning.design.patterns.creational.factory;

/**
 * See Factory image in README.md
 * This is the Creator
 */
public abstract class RestaurantFactory {
    public IBurger orderBurger(){
        IBurger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract IBurger createBurger();
}

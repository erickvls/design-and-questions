package com.examples.self.learning.design.patterns.creational.factory;

/**
 * Nice catch up:
 * Replacing conditionals for lambda expressions
 * <a href="https://www.linkedin.com/pulse/factory-pattern-replacing-conditional-statement-lambda-ahmad-atwi/">Linkedin Post</a>
 * Reference Video: <a href="https://www.youtube.com/watch?v=EdFq_JIThqM&ab_channel=Geekific">Youtube Video</a>
 * See Factory image in README.md
 */

class Main{
    public static void main(String[] args) {
        RestaurantFactory restaurantFactory = new BeefBurgerRestaurant();
        IBurger beefBurger = restaurantFactory.orderBurger();
    }
}
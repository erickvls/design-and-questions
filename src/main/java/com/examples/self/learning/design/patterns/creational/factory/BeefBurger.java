package com.examples.self.learning.design.patterns.creational.factory;

/**
 * See Factory image in README.md
 * This is the concrete product A
 */
class BeefBurger implements IBurger{
    @Override
    public void prepare() {
        System.out.println("Preparing Beef burger..");
    }
}
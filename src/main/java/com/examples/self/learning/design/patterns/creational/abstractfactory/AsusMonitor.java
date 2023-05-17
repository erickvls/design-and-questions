package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * See Abstract Factory image in README.md
 * This is the Concrete Product A2
 */
public class AsusMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Creating Asus Monitor...");
    }
}

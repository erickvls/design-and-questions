package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * See Abstract Factory image in README.md
 * This is the Concrete Product A1
 */
public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Creating Asus GPU...");
    }
}

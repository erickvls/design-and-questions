package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * See Abstract Factory image in README.md
 * This is the Concrete Product B1
 */
public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Creating MSI GPU");
    }
}

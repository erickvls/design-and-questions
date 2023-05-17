package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * See Abstract Factory image in README.md
 * This is the Abstract Factory
 */
public abstract class CompanyAbstractFactory {

    public abstract Gpu createGPU();
    public abstract Monitor createMonitor();
}

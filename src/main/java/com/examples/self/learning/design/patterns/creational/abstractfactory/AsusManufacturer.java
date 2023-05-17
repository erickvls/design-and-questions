package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * See Abstract Factory image in README.md
 * This is the Concrete Factory 2
 */
public class AsusManufacturer extends CompanyAbstractFactory {
    @Override
    public Gpu createGPU() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}

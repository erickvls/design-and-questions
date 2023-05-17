package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * See Abstract Factory image in README.md
 * This is the Concrete Factory 1
 */
public class MsiManufacturer extends CompanyAbstractFactory {
    @Override
    public Gpu createGPU() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}

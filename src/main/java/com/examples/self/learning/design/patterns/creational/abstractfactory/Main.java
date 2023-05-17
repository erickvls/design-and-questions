package com.examples.self.learning.design.patterns.creational.abstractfactory;

/**
 * Problem:
 * Suppose you are just manufacturing GPUs. Now the GPUs you are manufacturing belong to a certain brand and the brands covered by our company are MSI and Asus
 * Reference video from: <a href="https://www.youtube.com/watch?v=QNpwWkdFvgQ&ab_channel=Geekific">Youtube Vídeo</a>
 */
public class Main {
    public static void main(String[] args) {
        CompanyAbstractFactory companyAbstractFactory = new AsusManufacturer();
        companyAbstractFactory.createGPU().assemble();
        companyAbstractFactory.createMonitor().assemble();
    }
}

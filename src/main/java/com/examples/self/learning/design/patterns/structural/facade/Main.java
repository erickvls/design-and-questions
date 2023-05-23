package com.examples.self.learning.design.patterns.structural.facade;

/**
 * See Problem.md and Readme.md
 */
public class Main {
    public static void main(String[] args) {
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();
        buyCryptoFacade.buyCryptoCurrency(100,"BTC");
    }
}

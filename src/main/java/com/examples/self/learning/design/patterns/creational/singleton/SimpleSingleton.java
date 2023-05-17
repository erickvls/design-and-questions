package com.examples.self.learning.design.patterns.creational.singleton;

/**
 * The singleton pattern ensures a class has only one instance and provide global access to it.
 * The most common reason for this is to control access to some shared resource—for example, a database or a file.
 */
public class SimpleSingleton {
    static private SimpleSingleton INSTANCE;
    private String name;
    private SimpleSingleton(String name){
        this.name = name;
    }

    public static SimpleSingleton getInstance(String name){
        if(INSTANCE == null){
            INSTANCE = new SimpleSingleton(name);
        }
        return INSTANCE;
    }

    public String getName(){
        return name;
    }
}
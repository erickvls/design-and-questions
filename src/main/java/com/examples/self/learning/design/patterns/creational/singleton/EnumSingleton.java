package com.examples.self.learning.design.patterns.creational.singleton;


/**
 * We can have also an enum to act as a singleton.

 * When implementing with an enum, the single instance of the class is set to a value within the enum itself.
 * There is no need for a private constructor, as the enum ensures that only one instance of the class exists.
 * Any attribute or method can be added to the enum.

 * Both implementations ensure that only one instance of the class is created, but the enum implementation is
 * simpler and ensures that only one instance exists without the need for synchronization in multithreading environments.
 */
enum EnumSingleton {
    INSTANCE;

    private String value;

    EnumSingleton() {
        this.value = "FOO";
    }

    public String getValue() {
        return value;
    }

}
package com.examples.self.learning.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;

class Main{
    public static void main(String[] args) throws SQLException {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SimpleSingleton singleton = SimpleSingleton.getInstance("FOO");
        SimpleSingleton anotherSingleton = SimpleSingleton.getInstance("BAR");
        System.out.println(singleton.getName());
        System.out.println(anotherSingleton.getName());
        System.out.println("----- Using ENUM -------");
        System.out.println(EnumSingleton.INSTANCE.getValue());

        /*
         * How you would call the instance for db connection
         * DBConnectionEnum.INSTANCE.getConnection();
         */

        Connection enumDBSingleton = EnumDBSingleton.INSTANCE.getConnection();
        SimpleDBSingleton simpleDBSingleton = SimpleDBSingleton.getInstance("test","test","test");
        simpleDBSingleton.connect();
    }
}



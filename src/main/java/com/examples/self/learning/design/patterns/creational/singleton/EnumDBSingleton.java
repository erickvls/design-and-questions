package com.examples.self.learning.design.patterns.creational.singleton;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Example Enum being used as a singleton as db connection
 */
enum EnumDBSingleton {
    INSTANCE;

    private Connection connection;

    EnumDBSingleton() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "myuser";
            String password = "mypassword";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to database", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

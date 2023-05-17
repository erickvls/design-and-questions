package com.examples.self.learning.design.patterns.creational.singleton;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Example Class being used as a singleton as db connection
 */
class SimpleDBSingleton{
    private static SimpleDBSingleton INSTANCE;
    private final String url;
    private final String user;
    private final String password;
    private Connection connection;

    private SimpleDBSingleton(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public static SimpleDBSingleton getInstance(String url, String user, String password){
        if(INSTANCE == null){
            INSTANCE = new SimpleDBSingleton(url,user,password);
        }
        return INSTANCE;
    }

    public Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}
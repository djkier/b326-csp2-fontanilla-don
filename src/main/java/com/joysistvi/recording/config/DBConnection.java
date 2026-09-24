package com.joysistvi.recording.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final String URL =
            "jdbc:mysql://localhost:3306/songs_db";

    private final String USER = "root";
    private final String PASSWORD = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

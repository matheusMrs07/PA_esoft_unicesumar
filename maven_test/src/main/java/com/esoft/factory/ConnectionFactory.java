package com.esoft.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static final String URL = "jdbc:mysql://localhost:3306/esoft";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static Connection getConnectionMySQL() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);

    }


}

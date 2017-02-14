package com.ipn.escom.sistemas.callingstoredprocedure.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class Conexion {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/practica";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public Connection getDBConnection() {

        Connection dbConnection = null;
        
        try {

            Class.forName(DB_DRIVER);
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            
            return dbConnection;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }
}

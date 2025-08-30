package com.madeprodisma.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

   
    private static final String URL = "jdbc:mysql://localhost:3306/madepro_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 


    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a MySQL");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return null;
        }
    }
}

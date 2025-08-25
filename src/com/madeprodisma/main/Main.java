package com.madeprodisma.main;

import com.madeprodisma.conexion.Conexion;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = Conexion.getConnection();
        if (conn != null) {
            System.out.println("✅ Conexión probada con éxito!");
        } else {
            System.out.println("❌ No se pudo conectar.");
        }
    }
}

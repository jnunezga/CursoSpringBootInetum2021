package com.domain.util;

import java.sql.*;

public class ConnectionManager {
	// atributos
	private static Connection conn;
	
	public static void conectar() throws ClassNotFoundException, SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inetum", "root", "Inetum021");
	}
	
	public static void desconectar() throws SQLException {		
		conn.close();
	}
	
	public static Connection getConnection() {
		return conn;
	}
}

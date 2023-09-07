package com.utp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private final static String url = "jdbc:postgresql://batyr.db.elephantsql.com:5432/yfoystaz";
	private final static String user= "yfoystaz";
	private final static String password = "sZgz0MacWLGfFjcj6WhIKsGc1lIUVcIk";
	protected static Connection conn = null;

	public static Connection connect() {
		try {
			conn = DriverManager.getConnection(url, user, password);
		    System.out.println("Connected to the PostgreSQL server successfully.");
		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}

	        return conn;
	}

	public static void desconectar() {

		if (conn == null) {
			return;
		}

		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Connect.connect();
    }
}

package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		
		String password="Komal@123";
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo2";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		
		
		return con;
		
	}
}

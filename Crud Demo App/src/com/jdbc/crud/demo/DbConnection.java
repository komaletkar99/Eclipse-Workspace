package com.jdbc.crud.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/atdevassignment";
		
		String username="root";
		
		String password="Komal@123";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		
		return con;
		
	}
}

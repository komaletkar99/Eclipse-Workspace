package com.CRUD.operation.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/jdbcdemo? autoReconnect = true&useSSL=false";

//		String url = "jdbc:mysql://localhost:3306/jdbcdemo";

		String username = "root";

		String pass = "Komal@123";

		Connection con = DriverManager.getConnection(url, username, pass);
		return con;

	}

}

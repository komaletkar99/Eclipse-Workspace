package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class myfirstHibernetApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo11", "root", "Komal@123");
		
		String create = "create table student(int id, String name)";
		
		PreparedStatement stmt = con.prepareStatement(create);
		stmt.executeUpdate();
		
		System.out.println("table created sucessfully");
	}

}

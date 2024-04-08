package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbcApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String username="root";
		
		String pass = "Komal@123";
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo2";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		
//		String createTable = "create table Student(studentId int, studentName varchar(20), studentAge int, studentAge varchar(20))";
//		
//		Statement stmt = con.createStatement();
//		
//		stmt.executeUpdate(createTable);
//		
		System.out.println("Table created sucessfully..");
		
		String insert = "insert into Student values(101,'Pallavi',25,'Female')";
		String insert1 = "insert into Student values(102,'Kirti',22,'Female')";
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate(insert);
		stmt.executeUpdate(insert1);
		System.out.println("Record inserted sucessfully.... ");

	}

}

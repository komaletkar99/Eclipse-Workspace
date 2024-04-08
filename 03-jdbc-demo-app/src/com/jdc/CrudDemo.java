package com.jdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudDemo {

Scanner sc = new Scanner(System.in);
Student s = new Student();
	
	public  void createTable() throws SQLException, ClassNotFoundException {
		
		Connection con = Connectionconfig.getConnection();
		
		String createTable = "create table employee(id int,"
		+ "name varchar (20),"
		+ "city varchar(20),"
		+ "age int,"
		+ "gender varchar(20))";
		
		PreparedStatement stmt = con.prepareStatement(createTable);
		
		stmt.executeUpdate();
		
		stmt.close();
		
		con.close();
		
		System.out.println("Table created Sucessfully");
	}
}

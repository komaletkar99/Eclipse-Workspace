package com.jdc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testCrud {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	System.out.println("executing started");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root","Komal@123");
	
    String sqlquery = "create table Samplejdbc (id int, name varchar(20))";
    
    PreparedStatement stmt = con.prepareStatement(sqlquery);
    
    System.out.println("table created sucessfully");
//	
//	String sql = "insert into Samplejdbc values(101,'komal')";
//	
//	String sql1 = "insert into Samplejdbc values(102,'anuja')";
//	
//	Statement stmt = con.createStatement();
//	
//	stmt.executeUpdate(sql);
//	
//	stmt.executeUpdate(sql1);
//	
//	System.out.println("Data inserted");
//	
	con.close();
	}



}
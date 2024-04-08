package com.preapredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Psdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("jdbc app started....");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/jdbcdemo11";
		
		String username="root";
		
		String pass = "Komal@123";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		
		String table = "create table student(id int, name varchar(20), age int, gender varchar(20))";
//		
		Statement statement = con.createStatement();
//		
		statement.execute(table);
//		
		statement.close();
//		
		con.close();
//		
		System.out.println("table created");
		
//		String insertQuery = "insert into student(id,name,age,gender) values (?,?,?,?)";
//		
//		PreparedStatement stmt = con.prepareStatement(insertQuery);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//		
//			System.out.println("Enter student id :");
//			int id = sc.nextInt();
//			
//			System.out.println("Enter student name :");
//			String name = sc.next();
//		
//			System.out.println("Enter student age :");
//			int age = sc.nextInt();
//			
//			System.out.println("Enter student gender :");
//			String gender = sc.next();
//			
//			stmt.setInt(1, id);
//			
//			stmt.setString(2, name);
//			
//			stmt.setInt(3, age);
//			
//			stmt.setString(4, gender);
//			
//			stmt.execute();
//		
//			System.out.println("record inserted sucessfully..");
//			System.out.println("do you want to continue yes/no");
//			
//			String s1 = sc.next();
//			
//			if(s1.equalsIgnoreCase("no"))
//			{
//				break;
//			}
//			
//		}
//		stmt.close();
	}

}

package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String username = "root";

		String password = "Komal@123";

		String url = "jdbc:mysql://localhost:3306/jdbcdemo2";

		Connection con = DriverManager.getConnection(url, username, password);

		// String create = "create table Employee(empId int, empName varchar(20))";

		String insert = "insert into Employee(empId, empName) values(?,?)";

		PreparedStatement ps = con.prepareStatement(insert);

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter Employee id:");
			int id = sc.nextInt();

			ps.setInt(1, id);

			System.out.println("Enter employee Name:");
			String name = sc.next();

			ps.setString(2, name);

			
			ps.executeUpdate(); 
			
			System.out.println("Record inserted sucessfully....");
			
			System.out.println("Do you want to continue: yes/no");
			String s1 = sc.next();

			if (s1.equalsIgnoreCase("no")) {
				break;
			}
		}

	}

}

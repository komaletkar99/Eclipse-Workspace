package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class crudDemo {

	Enployee e = new Enployee();
	
	Scanner sc = new Scanner(System.in);
	
	public  void createTable() throws SQLException, ClassNotFoundException {
		
		Connection con = dbConnection.getConnection();
		
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
	
	public void insertData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String insert = "insert into employee(id,name,city,age,gender) values(?,?,?,?,?)";
		
			System.out.println("enter employee id:");
		e.setId(sc.nextInt());
			
			System.out.println("enter employee name:");
			e.setName(sc.next());
			
			System.out.println("enter employee city:");
			e.setCity(sc.next());
			
			System.out.println("enter employee age:");
			e.setAge(sc.nextInt());
			
			System.out.println("enter employee gender:");
			e.setGender(sc.next());
			
			PreparedStatement ps = con.prepareStatement(insert);
			
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getCity());
			ps.setInt(4, e.getAge());
			ps.setString(5, e.getGender());
			
			ps.executeUpdate();
			
			System.out.println("Record inserted sucessfully..");
			
		ps.close();
			
		con.close();
		
		
	}

	
	
	public void updateData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String update = "update employee set name = 'Pooja' where id = ?";
		
		PreparedStatement ps = con.prepareStatement(update);
		
		System.out.println("enter id for update data..");
		
		ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		
		System.out.println("data updated sucessfully..");
		
		ps.close();
		
		con.close();
		
		
	
		
	}
	
	public void deleteData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String delete = "delete from employee where id = ?";
		
		PreparedStatement ps = con.prepareStatement(delete);
		
		System.out.println("entere id for deletion");
		
		ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		
		System.out.println("deleted sucessfully");
		
		
		
		
	}
}

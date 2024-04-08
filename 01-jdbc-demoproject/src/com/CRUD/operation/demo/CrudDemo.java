package com.CRUD.operation.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudDemo {

	Scanner sc = new Scanner(System.in);
	Employee e = new Employee();
	
	public void createTable() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String table = "create table employee("
				+ "empId int not null,"
				+ "empName varchar(20) not null,"
				+ "empAddress varchar(20) not null,"
				+ "empDesignation varchar(20) not null,"
				+ "Salary varchar(20) not null)";
		
		
				
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate(table);
		
		System.out.println("Table Created Sucessfully");
		
		stmt.close();
		
		con.close();
	}
	
	public void insertData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		System.out.println("Insert employee records:");
		
		System.out.println("Insert employee id :");
		e.setEmpId(sc.nextInt());
		
		System.out.println("Insert employee name :");
		e.setEmpName(sc.next());
		
		System.out.println("Insert employee address :");
		e.setEmpAddress(sc.next());
		
		System.out.println("Insert employee designation :");
		e.setEmpDesignation(sc.next());
		
		System.out.println("Insert employee salary :");
		e.setSalary(sc.next());
		
		
		String insert = "insert into employee values(?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(insert);
		
		ps.setInt(1, e.getEmpId());
		ps.setString(2, e.getEmpName());
		ps.setString(3, e.getEmpAddress());
		ps.setString(4, e.getEmpDesignation());
		ps.setString(5, e.getSalary());
		
		ps.executeUpdate();
		
		System.out.println("Records inserted sucessfully");
		
		ps.close();
		
		con.close();
	}
	
	public void displayData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String display = "select * from employee";
		
		PreparedStatement ps = con.prepareStatement(display);
		
//		ps.executeUpdate();
//		
		ps.close();
//		
		con.close();
	}
	
	public void updateRecords() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String update = "update employee set empName = 'Pooja' where empId = ?";
		
		PreparedStatement ps = con.prepareStatement(update);
		
		System.out.println("Enter empId for updation");
		
		ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		
		System.out.println("Record updated sucessfully ..");
		
		ps.close();
		
		con.close();
	}
	
	public void deleteData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		String delete = "delete from employee where empId = ?";
		
		PreparedStatement ps = con.prepareStatement(delete);
		
		System.out.println("enter id for delete data");
		
		ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		
		System.out.println("Records deleted sucessfully");
		
		ps.close();
		
		con.close();
	}
}


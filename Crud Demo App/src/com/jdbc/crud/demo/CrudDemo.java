package com.jdbc.crud.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudDemo {
	Scanner sc = new Scanner(System.in);
	
	Student s = new Student();
	
	public void createTable() throws ClassNotFoundException, SQLException {
		Connection con = DbConnection.getConnection();
		
		String create = "create table Student(studentId int, studentName varchar(20),  studentCity varchar(20), "
				+ "StudentGender varchar(20), studentState varchar(20), studentCountry varchar(20))";
		
		PreparedStatement ps = con.prepareStatement(create);
		
		ps.executeUpdate();
		
		System.out.println("Table created sucessfully");
		
		ps.close();
		
		con.close();
	}

	public void InsertData() throws ClassNotFoundException, SQLException {
		Connection con = DbConnection.getConnection();
		
		String insert = "insert into Student(studentId, studentName, studentCity, StudentGender, studentState, studentCountry) values(?,?,?,?,?,?)";
		
		System.out.println("Enter student id:");
		s.setStudentId(sc.nextInt());
		
		System.out.println("Enter student name:");
		s.setStudentName(sc.next());
		
		System.out.println("Enter student city:");
		s.setStudentCity(sc.next());
		
		System.out.println("Enter student gender:");
		s.setStudentGender(sc.next());
		
		System.out.println("Enter student state:");
		s.setStudentState(sc.next());
		
		System.out.println("Enter student country:");
		s.setStudentCountry(sc.next());
		
		PreparedStatement ps = con.prepareStatement(insert);
		
		ps.setInt(1, s.getStudentId());
		ps.setString(2, s.getStudentName());
		ps.setString(3, s.getStudentCity());
		ps.setString(4, s.getStudentGender());
		ps.setString(5, s.getStudentState());
		ps.setString(6, s.getStudentCountry());
		
		ps.executeUpdate();
		
		ps.close();
		
		System.out.println("Record inserted Sucessfully..");
		
		con.close();
		
	}
	
	public void UpdateData() throws ClassNotFoundException, SQLException {
		Connection con  = DbConnection.getConnection();
		
		String update = "update Student set studentName = 'Sumit' where studentId=?";
		
		PreparedStatement ps = con.prepareStatement(update);
		
	     System.out.println("Enter student id for update data: ");
		
		 ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		
		System.out.println("Record updated");
		
		ps.close();
		
		con.close();
		
		
		
		
	}
	
	public void DeleteData() throws ClassNotFoundException, SQLException {
		
		Connection con = DbConnection.getConnection();
		
		String delete = "delete from Student where studentid = ?";
		
		PreparedStatement ps = con.prepareStatement(delete);
		
		System.out.println("Please enter student id for deletetion: ");
		
		ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		
		ps.close();
		
		System.out.println("Record deleted sucessfully..");
		
		con.close();
	}
}

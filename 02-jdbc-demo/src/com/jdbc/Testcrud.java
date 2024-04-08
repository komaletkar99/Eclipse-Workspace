package com.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Testcrud {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		crudDemo ob = new crudDemo();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.create table");
			System.out.println("2.insert records into table");
			System.out.println("3.update records from table");
			System.out.println("4.delete records from table");
			System.out.println("Please enter your choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1: ob.createTable();
			break;
			
			case 2:ob.insertData();
			break;
			
			case 3: ob.updateData();
			break;
			
			case 4:
				ob.deleteData();
				break;
			}
		
		System.out.println("do you want to continue yes/no");
		String s1=sc.next();
		
		if(s1.equalsIgnoreCase("no")) {
			break;
		}

		}
	}

}

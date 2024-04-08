package com.jdbc.crud.demo;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CrudDemo ob = new CrudDemo();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Create table:");
			System.out.println("2.Insert data into table");
			System.out.println("3. Update  Record from Table:");
			System.out.println("4. Delete Record from table:");
			System.out.println("Please enter your Choice: ");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1: ob.createTable();
			break;
			
			case 2: ob.InsertData();
			break;
			
			case 3: ob.UpdateData();
			break;
			
			case 4: ob.DeleteData();
			break;
			}
			
			System.out.println("Do you want to continue: yes/no");
			String s1 = sc.next();
			
			if(s1.equalsIgnoreCase("no")) {
				break;
			}
		}
		
	}

}

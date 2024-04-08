package com.CRUD.operation.demo;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CrudDemo db = new CrudDemo();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1. create a new table");

			System.out.println("2. insert a record");

			System.out.println("3. Display Records");

			System.out.println("4. update records");

			System.out.println("5. delete records using id");

			System.out.println("please enter ur choice");

			int op = sc.nextInt();

			switch (op) {

//			case 1 : db.createTable();
//			break;

			case 2:
				db.insertData();
				break;

			case 3:
				db.displayData();
				break;

			case 4:
				db.updateRecords();
				break;

			case 5:
				db.deleteData();
				break;
			}

			System.out.println("do you want to continue yes/no");

			String s1 = sc.next();

			if (s1.equalsIgnoreCase("no")) {
				break;
			}
		}

	}

}

package com.fourelementsofttechDailyPractice;

import java.util.Scanner;

public class parematerizedConstructorDemo {
	String firstName;
	String lastName;
	double salary;
	long mobileno;
	
	public parematerizedConstructorDemo(String firstName,String lastName,double salary,long mobileno) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary = salary;
		this.mobileno = mobileno;
	}
	
	

	@Override
	public String toString() {
		return "parematerizedConstructorDemo [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", mobileno=" + mobileno + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name  : ");
		String firstName = sc.next();
		System.out.println("enter last name  : ");
		String lastName = sc.next();
		System.out.println("enter salary : ");
		double salary = sc.nextDouble();
		System.out.println("enter mobile no  : ");
		long mobileno = sc.nextLong();
		
		
	parematerizedConstructorDemo obj = new parematerizedConstructorDemo(firstName, lastName, salary, mobileno);
		parematerizedConstructorDemo obj1 = new parematerizedConstructorDemo(firstName, lastName, salary, mobileno);

		System.out.println(obj);
		System.out.println();
		System.out.println(obj1);

	}

}

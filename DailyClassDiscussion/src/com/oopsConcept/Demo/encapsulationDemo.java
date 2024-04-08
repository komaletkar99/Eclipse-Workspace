package com.oopsConcept.Demo;

import java.util.Scanner;

public class encapsulationDemo {
	private int id;
	private String name;
	
//	public int getId() {
//		return this.id;
//	}
//	public void SetId(int sid) {
//		this.id=sid;
//	}
//	public void SetName(String sname) {
//		this.name=sname;
//	}
//	public String getName() {
//		return this.name;
//	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		encapsulationDemo ob = new encapsulationDemo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you id : ");
		int id= sc.nextInt();
		
		ob.setId(id);
		System.out.println("Id is : " + ob.getId());
		
		System.out.println("Enter your name : ");
		 String s = sc.next();

		ob.setName(s);
		System.out.println("name is " + ob.getName());
		

	}
}
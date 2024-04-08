package com.fourelementsofttechDailyPractice;

public class privateConstructorDemo {
	int id;
	String name;
	
	private privateConstructorDemo() {
		this.id=10;
		this.name="komal";
		
		System.out.println(id + " " + name);
	}
	
	private privateConstructorDemo(int id, String name) {
		this.id=id;
		this.name=name;
		
		System.out.println(id + " " + name);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateConstructorDemo obj1 = new privateConstructorDemo();
		privateConstructorDemo obj2 = new privateConstructorDemo(15,"komu");

	}

}

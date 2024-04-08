package com.fourelementsofttechDailyPractice;

public class Variable {
	int n=101;// Instacce variable it is declare outside of method of constructor but within class
	static String name ="Komal"; // static variable it is declare outside of method of constructor but within class
	

	public void show() {
		int age = 24; // local variable it id declare inside the method or constructor and block;
		System.out.println(age);
	}
	public static void display() {
		String lastname="etkar";
		System.out.println(name + "  " + lastname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(display());
//		Variable v = new Variable();
//		v.n;
		display();
			

	}

}

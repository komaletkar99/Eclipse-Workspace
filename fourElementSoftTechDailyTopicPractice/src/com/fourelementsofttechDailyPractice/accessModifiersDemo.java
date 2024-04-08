package com.fourelementsofttechDailyPractice;

public class accessModifiersDemo {
	public int n = 10;
	int id = 90;

	public void name() {
		System.out.println("This is  a parent class method");

	}

class demo extends accessModifiersDemo {
	public void add(int n,int id) {
		int sum=n+id;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
//		demo obj = new demo();
		
	}
}
}

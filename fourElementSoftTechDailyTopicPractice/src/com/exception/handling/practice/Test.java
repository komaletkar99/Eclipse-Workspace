package com.exception.handling.practice;

public class Test {

	public static void m1() {
		m2();
	}
	public static void m2() {
		m1();
	}
	public static void main(String[] args) {
		try {
		System.out.println(10/5);
		}
		catch(Exception e) {
			System.out.println("hello");

		}
			
		

	}

}

package com.exception.handling.practice;

public class dem0 {
	public void m1() {
		m2();
	}
	public void m2() {
		m1();
	}

	public static void main(String[] args) {
		try {
		try {
			System.out.println(10/0); 
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		}
		catch (Exception e) {
			
		}
		finally {
			System.out.println("finally block exceuted ");
		}

	}

}

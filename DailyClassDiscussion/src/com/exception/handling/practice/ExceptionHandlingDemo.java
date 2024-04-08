package com.exception.handling.practice;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
			int n = 10 / 0;
	
			System.out.println(n);
			System.exit(0);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
			//System.out.println("Catch exception handled");
			//System.exit(0);
		}
		finally {
			System.out.println("finally block executed");
		}

	}

}

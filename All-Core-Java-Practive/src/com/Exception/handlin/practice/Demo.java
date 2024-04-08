package com.Exception.handlin.practice;

public class Demo {

	public static void main(String[] args) {
		try {
			
	int a=10/0;
	System.out.println(a);
		}
		catch(Exception e) {
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println(e.toString());
			//System.out.println("catch block executed");
			//System.exit(0);
		}
//		finally {
//			System.out.println("finally block executed");
//		}
	}

}

package com.exception.handling.practice;

public class ExceptionWithReturn {
	//int res;
	public int display()
	{
		try {
//			System.out.println(100/0);
			System.out.println("try block");
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println(100/0);
		
			System.out.println("exception handled");
		}
		finally {
			System.out.println("finally block executed");
		}
		return 0;
	}

	public static void main(String[] args) {
		
		ExceptionWithReturn ob = new ExceptionWithReturn();
		System.out.println(ob.display());

	}

}

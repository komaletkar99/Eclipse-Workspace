package com.exceptiondemo;

public class demo {
	public void show()
	{
		try {
		System.out.println(100/0);
	}
		catch(Exception e) {
		System.out.println("Hnadled exception using catch block" );
		e.printStackTrace();
	}
		finally {
			System.out.println("finally block executed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		d.show();

	}

}

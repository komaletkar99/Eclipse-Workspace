package com.fourelementsofttechDailyPractice;

public class blocDemo {

	int n =10;
	static String s = "hjgfj";
	
	{
		System.out.println("This is a instance block");
	}
	
	static {
		int age = 24;
		
		System.out.println("This is a static bolck" + age);
	}
	
	static {
		System.out.println("This is a static bolck 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blocDemo b = new blocDemo();
	System.out.println(b.n);
	System.out.println(blocDemo.s);
	

	}

}

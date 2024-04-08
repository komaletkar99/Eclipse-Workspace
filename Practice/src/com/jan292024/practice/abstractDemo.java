package com.jan292024.practice;

public abstract class abstractDemo {
//	public static int a;
//	public final int b=0;
	
	
	public abstract void show();
	public void m1() {
		System.out.println("m1 method");
	}
	public static void m2() {
		System.out.println("m2 m2thod");
	}
	public static void display() {
		System.out.println("concrete methods executed");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test.display();
		test.m2();
		test t = new test();
		t.show();
		t.m1();

	}
}
	class test extends abstractDemo{

//		@Override
		public  void show() {
			System.out.println("abstract method");
			
		}
		
	}



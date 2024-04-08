package com.Methods;

public class StaticMethodDemo {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String show() {
		return "hiiii";
	}
	
	public static void display() {
		System.out.println(StaticMethodDemo.show());
		System.out.println(StaticMethodDemo.add(4, 6));
		
		
	}

	public static void main(String[] args) {
		StaticMethodDemo.display();

	}
}
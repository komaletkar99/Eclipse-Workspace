package com.polymorphism;

public class MethodOverloadingDemo {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(char a, int c) {
		return a-c;
	}

	public static void main(String[] args) {
		MethodOverloadingDemo ob = new MethodOverloadingDemo();
		ob.add(4, 2);
		ob.add(7, 5);

		System.out.println(ob.add(4, 2));
		System.out.println(ob.add('c', 2));
	}
}

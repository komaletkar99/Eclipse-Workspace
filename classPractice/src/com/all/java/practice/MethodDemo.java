package com.all.java.practice;

public class MethodDemo {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, byte b) {
		return a + b;

	}

	public static void main(String[] args) {
		// MethodDemo.add(10, 30);
		System.out.println(MethodDemo.add(10, 30));
		System.out.println(MethodDemo.add(45, 6));
	}

}

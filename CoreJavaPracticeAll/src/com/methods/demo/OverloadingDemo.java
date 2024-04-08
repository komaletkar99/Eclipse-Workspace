package com.methods.demo;

public class OverloadingDemo {
	public static int add(int a, int b){
		return a+b;
		
	}
	public static int add(int a, byte b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(OverloadingDemo.add(4, 5));
		System.out.println(OverloadingDemo.add(10,15));

	}

}

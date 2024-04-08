package com.methodoverloading;

public class OverloadingDemo {

	private int add(int a,int b) {
		return a+b;
	}
	
	protected long add(long a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		OverloadingDemo ob = new OverloadingDemo();
		System.out.println(ob.add(10, 20));
		System.out.println(ob.add(20, 30));

	}

}

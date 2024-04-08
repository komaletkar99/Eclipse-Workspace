package com.incrementDecrement;

public class Test {

	public static void main(String[] args) {
		int a=10;
		int b=a++ + a++ + a-- + --a + ++a + ++a;//10 + 11 + 12 + 10 + 11 + 12;
		System.out.println(b);
		

	}

}

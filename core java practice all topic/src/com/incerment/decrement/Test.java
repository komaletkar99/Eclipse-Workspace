package com.incerment.decrement;

public class Test {

	public static void main(String[] args) {
		int x=10;
		int y = x++ + ++x + --x + --x + x-- + ++x + ++x + x++; // 10 + 12 + 11 + 10 + 10 + 10 + 11 + 11;
		System.out.println(y);
	}

}

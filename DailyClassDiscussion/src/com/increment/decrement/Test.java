package com.increment.decrement;

public class Test {
	public static void main(String[] args) {
		int x = 9;
		int y = x++ + x++ + ++x + --x + x-- + ++x;// 9 + 10 + 12 + 11 + 11 + 11
		System.out.println(y);
	}

}

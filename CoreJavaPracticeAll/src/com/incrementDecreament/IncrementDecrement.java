package com.incrementDecreament;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x = 10;
		int y = x++ + x++ + ++x + --x + x-- + x++ + --x + --x;  // 10 + 11 + 13 + 12 + 12 + 11 + 11 + 10
		
		System.out.println(y);

	}

}

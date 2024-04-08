package com.all.java.practice;

public class incremenetDecrementDemo {

	public static void main(String[] args) {
	int x  = 7;
	int y = x++ + ++x + --x + x++ + x--; //7+9 + 8 + 8 + 9;
	System.out.println(y);
	}

}

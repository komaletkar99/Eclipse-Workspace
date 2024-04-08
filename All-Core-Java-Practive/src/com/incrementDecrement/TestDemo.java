package com.incrementDecrement;

public class TestDemo {

	public static void main(String[] args) {
	int a=7;
	int b=a;//7
	b=a++ + b;
	System.out.println(a + " " + b);
	
	int i=0;
	int j=i;
	j=i++ + j;
	System.out.println(i + "-" + j);

	}

}

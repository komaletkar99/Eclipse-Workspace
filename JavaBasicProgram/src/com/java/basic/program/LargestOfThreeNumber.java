package com.java.basic.program;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=6;
		int c=11;
		
//		if(a>b && a>c) {
//			System.out.println(a);
//		}
//		else if(b>a && b>c) {
//			System.out.println(b);
//		}
//		else {
//			System.out.println(c);
//		}
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
		else {
			System.out.println(c);
		}
		}
		
		if(b>a) {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}

}

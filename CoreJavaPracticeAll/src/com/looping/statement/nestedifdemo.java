package com.looping.statement;

public class nestedifdemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=5;
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



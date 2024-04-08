package com.sring.assignments.methods;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		
		//first approach
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String");
//		String s = sc.nextLine();
//		
//		int count = s.split("\\s").length;
//		System.out.println("Number of words is : " + count);
		
		//Second approach
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();// Hello java
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println("Number of words is : " + count);
		//pivote table canvee lookup mail id creation 365 licence handling
		

	}

}

package com.array.assignments;

import java.util.Scanner;

public class ReverseNumberThreeWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int rev=0;
		// first Way using while loop
//		
//		while(n!=0) {
//			int last = n%10;
//			rev=rev*10+last;
//			n=n/10;
//		}
//		System.out.println("Reversed number : " + rev);
		
//		//second way using String buffer
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append(n);
//		sb.reverse();
//		System.out.println(sb);
		
		//third way using StringBuilder
		
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		sb.reverse();
		System.out.println(sb);
		

	}

}

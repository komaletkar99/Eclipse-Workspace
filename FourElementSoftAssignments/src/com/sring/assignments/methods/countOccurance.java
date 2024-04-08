package com.sring.assignments.methods;

import java.util.Scanner;

public class countOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		int count=0;
		
		int length=s.length();
		int res = s.replace("j", "").length();
		count=length-res;
		System.out.println("Number of occurance is : " + count);

	}

}

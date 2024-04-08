package com.sring.assignments.methods;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// first Approach
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String");
//		String s = sc.nextLine();
//		
//		String[] words = s.split(" ");
//		String reverseString = "";
//		for(String word : words) {
//			String reverseword = "";
//			
//			for(int i=word.length()-1;i>=0;i--) {
//				reverseword += word.charAt(i);
//			}
//			reverseString += reverseword + " ";
//		}
//		System.out.println(reverseString);
		
		//Second Approach
		
		String s = "India is my country";
		String[] words = s.split("\\s");
		String reverseString = "";
		
		for(String w : words) {
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			reverseString += sb.toString() + " ";
		}
		System.out.println(reverseString);
		

	}

}

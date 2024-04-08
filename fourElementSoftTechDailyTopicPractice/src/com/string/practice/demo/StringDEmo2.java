package com.string.practice.demo;

public class StringDEmo2 {
	public static void main(String[] args) {
		String s1 = new String("rao");
		String s2 = s1.toLowerCase();
		System.out.println(s1==s2);
		String s3=s2.toString();
		System.out.println(s1==s3);
		String s4 = s3.toUpperCase();
		System.out.println(s4==s3);
		System.out.println(s3 + " " + s4);
		String s5 = "rao";
		String s6 = s5.toLowerCase();
		String s7 = s6.toString();
		System.out.println(s6==s7);
		
		
	}
}

package com.string.practice.demo;

public class Stringdemo {
	public static void main(String[] args) {
		String s1 = "komal";
		String s2 = s1.toString();
		System.out.println(s1==s2);
		String s3 = s1.toUpperCase();
		System.out.println(s1==s3);
		String s4=s1.toLowerCase();
		System.out.println(s4==s1);
		String s5 = s1.concat(s4);
		System.out.println(s5==s4);
		
	}
}

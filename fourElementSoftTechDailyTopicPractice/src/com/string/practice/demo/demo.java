package com.string.practice.demo;

public class demo {
public static void main(String[] args) {
	String s1 = new String("komal ");
	String s2 = new String("komal");
	String s3 = s2.concat(" etkar");
	String s4 = s3;
	System.out.println(s1.equals(s2));
	System.out.println(s1 == s2);
	System.out.println(s3==s2);
	System.out.println(s4 == s3);
	System.out.println(s4.equals(s3));
	
	String s5 = "Ritu";
	String s6 = "Ritu";
	System.out.println(s5);
	System.out.println(s6);
	String s8 = "Adhav";
	String s9 = s1.concat( s8);
	String s7 = s6.concat(" Patil");
	System.out.println(s7);
	System.out.println( s9);
}
}

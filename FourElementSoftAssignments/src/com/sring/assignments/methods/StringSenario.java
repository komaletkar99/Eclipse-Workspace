package com.sring.assignments.methods;

public class StringSenario {

	public static void main(String[] args) {
		String s1 = "java";
		String s2="java";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		String s3 = new String("java");
		//System.out.println(s1==s3);
		//System.out.println(s1.equals(s3));
		String s4 = new String("java");
		//System.out.println(s3==s4);
		//System.out.println(s3.equals(s4));
		
		
		String s5 = new String("java");
		String s6 = "java";
		String s7 = s6.toString();
		System.out.println(s5==s7);
		System.out.println(s4==s5);
		System.out.println(s5.equals(s6));
		System.out.println(s4.equals(s4));

	}

}

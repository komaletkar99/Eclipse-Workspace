package com.string;

public class StringDemo {

	public static void main(String[] args) {
	String s1 = "Pawan hjhj";
	s1.concat("kalyani");
	String s2 = "pawan";
	String s5 = "sarthak";
	
	String s3 = new String("Pawan");
	String s4 = new String("Pawan");
	System.out.println(s1.equals(s2));
	
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	
	System.out.println(s1.equals(s4));
	System.out.println(s2==s3);

	System.out.println(s1==s5);
	s1.equals(s5);
	System.out.println(s1);
	System.out.println(s1.toString());
	int len = s1.length();
	char[] ch =s1.toCharArray();
//	for(int i=0;i<ch.length;i++) {
//		System.out.print(ch[i] + " ");
//	}
	
	System.out.println(s1.intern());
	
	}

}

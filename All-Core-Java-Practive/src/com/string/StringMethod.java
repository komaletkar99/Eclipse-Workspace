package com.string;

public class StringMethod {

	public static void main(String[] args) {
	String s1 = "amruta";
	String s2 = "Amruta";
	
	s1.concat("monika");
	s2.concat("rtfgtret");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.concat(s2));
		
	String s3 = new String("punam");
	s3.concat("trupti");
	System.out.println(s3);
	
	System.out.println(s3.charAt(1));
	
	System.out.println(s3.length());
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s1.indexOf('u'));
	
	}
	

}

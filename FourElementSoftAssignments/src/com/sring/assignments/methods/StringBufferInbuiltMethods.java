package com.sring.assignments.methods;

public class StringBufferInbuiltMethods {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("komal");
		StringBuffer sb2 = new StringBuffer("komal");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

		System.out.println(sb1.compareTo(sb2));
	}

}

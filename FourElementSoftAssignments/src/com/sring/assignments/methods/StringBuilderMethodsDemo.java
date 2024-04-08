package com.sring.assignments.methods;

public class StringBuilderMethodsDemo {
public static void main(String[] args) {
	StringBuilder sb1 = new StringBuilder("java");
	StringBuilder sb2 = new StringBuilder("java");
	String sb3 = sb1.toString();
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb3));
	

}
}

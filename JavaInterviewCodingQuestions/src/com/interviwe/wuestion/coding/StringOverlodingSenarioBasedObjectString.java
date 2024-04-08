package com.interviwe.wuestion.coding;

public class StringOverlodingSenarioBasedObjectString {
	
	String s; // String return type is null
	Object o; // Object return type is null
	public void m1(String s) { // this is a String class method means child
		System.out.println("String parameter method");
	}
	public void m1(Object o) { // thie is a object class method means parent
		System.out.println("Object parameter method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOverlodingSenarioBasedObjectString ob = new StringOverlodingSenarioBasedObjectString();
		//here both method return null value but if we call s1.m1() method 
		//then always preference wiil get child method child class method first execute
		
		ob.m1(null);

	}

}

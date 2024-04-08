package com.oopsConcept.Demo;
 abstract class Demo1{
	public abstract void show();
	public void Display() {
		System.out.println("Method of Demo1 class");
	} 
 }
 class Demo2 extends Demo1{

	@Override
	public void show() {
		System.out.println("Method of Demo2 class");
		
	}
	 
 }

public class AbstractionDemo {
	public static void main(String[] args) {
		Demo2 ob = new Demo2();
		ob.Display();
		ob.show();

	}

}
 

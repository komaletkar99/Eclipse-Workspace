package com.oops.concept.demo;

abstract class demo{
	public abstract void show();
	public abstract void display();
}
class test extends demo{

	@Override
	public void show() {
		System.out.println("This is a show method");
		
	}

	@Override
	public void display() {
		System.out.println("This is a display method");
		
	}
	
}
public class abstractiondemo {

	public static void main(String[] args) {
		test t = new test();
		t.display();
		t.show();
	}

}

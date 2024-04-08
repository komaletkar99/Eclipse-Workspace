package com.abstractionDemo;

public abstract class AbstractDemo {

	public abstract void show();
	
	public void display() {
		System.out.println("Display method");
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.display();

	}

}

class Test extends AbstractDemo{

	@Override
	public void show() {
	System.out.println("This is show method");
		
	}
	
}
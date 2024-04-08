package com.jan292024.practice;
class parent{
	public void show() {
		System.out.println("Parent class method executed");
	}
	
}
class child extends parent{
	public void show() {
		System.out.println("child class method executed");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		parent c = new child();
		c.show();
		parent p = new parent();
		p.show();

	}

}

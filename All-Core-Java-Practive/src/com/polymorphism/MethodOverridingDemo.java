package com.polymorphism;
class parent{
	public int  add(int a, int b) {
		return a+b;
	}
}
class child extends parent{
	public int  add(int a, int b) {
		return a+b;
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.add(4, 5));
		System.out.println(	c.add(2, 4));

	}

}

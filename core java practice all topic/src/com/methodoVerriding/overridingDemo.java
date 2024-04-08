package com.methodoVerriding;

class parent{
	protected int add(int a, int b) {
		return a+b;
	}
}

class child extends parent{
	public int add(int a, int b) {
		return a+b;
	}
}
public class overridingDemo {

	public static void main(String[] args) {
	child c = new child();

	System.out.println(c.add(10, 20));
	System.out.println(c.add(20,30));;

	}

}

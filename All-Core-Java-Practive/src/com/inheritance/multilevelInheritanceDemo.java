package com.inheritance;
class A{
	public void add2(int a, int b) {
		System.out.println(a+b);
	}
}
class B extends A{
	public void add1(int a, int b) {
		System.out.println(a+b);
	}
}

class C extends B{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
public class multilevelInheritanceDemo {

	public static void main(String[] args) {
		C c = new C();
		c.add(4, 2);
		c.add1(7, 8);
		c.add2(6, 4);

	}

}

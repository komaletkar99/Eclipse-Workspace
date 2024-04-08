package com.jan292024.practice;
class parent1{
	public void show() {
		System.out.println("Parent1 method");
	}
}
class child1 extends parent1{
	public void show() {
		System.out.println("child method");
	}
}
class child2 extends child1{
	public void show() {
		System.out.println("child2 method");
	}
}
public class multilevelInheritanceDemo {

	public static void main(String[] args) {
		child1 ob = new child2();
		child1 obj = new child1();
		parent p = new parent();
		ob.show();
		obj.show();
		p.show();

	}

}

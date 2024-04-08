package com.inheritance;
class parent{
	public void show() {
	System.out.println("parent");
	}
}

class child extends parent{
	public void show1() {
		System.out.println("child");
		}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		child c = new child();
		c.show();

	}

}

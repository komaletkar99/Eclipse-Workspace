package com.Methods;

public class MethodDemo {
	public int add(int i, int j) {
		return i + j;

	}

	public String Show(String name) {
		return name;
	}

	public void display() {
	System.out.println("Display method");
	}
	public static void main(String[] args) {
		 MethodDemo d = new MethodDemo();
		 System.out.println(d.add(3, 5));
		 System.out.println(d.Show("komal"));
		
		 d.display();
		
	}

}

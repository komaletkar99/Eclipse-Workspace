package com.methods.demo;
 class  demo{
	public void show(int a, int b) {
		System.out.println(a-b);
	}
}
 class demo1 extends demo{
	 public void show(int a, int b) {
			System.out.println(a+b);
		}
 }

public class OverridingDemo {

	public static void main(String[] args) {
		demo d = new demo1();
		d.show(10, 4);
		demo d1 = new demo();
		d1.show(5, 1);

	}

}

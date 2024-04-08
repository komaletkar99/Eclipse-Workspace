package com.inheritance;
interface m1{
	public void show1() ;
}
interface m2{
	public void show2() ;
}
class m3 implements m1,m2{
	public void show() {
		System.out.println("m1 method");
	}

	@Override
	public void show2() {
		System.out.println("m2 method");
	}

	@Override
	public void show1() {
		System.out.println("m3 method");
		
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		m3 m = new m3();
		m.show();
		m.show1();
		m.show2();

	}

}

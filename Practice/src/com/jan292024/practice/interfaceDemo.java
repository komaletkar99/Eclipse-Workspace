package com.jan292024.practice;
interface m1{
	public abstract void add();
	public void m2();
	public void m3();
	public void m4();
}
abstract class m5 implements m1{

	@Override
	public void add() {
		System.out.println("add method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	public abstract void m3();

	@Override
	public abstract void m4();
	
}

class test11 extends m5{

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		
	}
	
}
public class interfaceDemo {

	public static void main(String[] args) {
		m5 ob = new test11();
		ob.add();
		ob.m2();
		ob.m3();
		ob.m4();

	}

}

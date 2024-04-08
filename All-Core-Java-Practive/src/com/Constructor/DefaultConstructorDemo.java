package com.Constructor;

public class DefaultConstructorDemo {
	int a;
	int b;
	
	public DefaultConstructorDemo() {
		this.a=7;
		this.b=9;
	}
	
	

	@Override
	public String toString() {
		return "DefaultConstructorDemo [a=" + a + ", b=" + b + "]";
	}



	public static void main(String[] args) {
		DefaultConstructorDemo d = new DefaultConstructorDemo();
		System.out.println(d);

	}

}

package com.jan292024.practice;

public class Variabledemo {
//	public static void m1() {
//		System.out.println("m1 method");
//	}
//	public static void m2() {
//		System.out.println("m2 method");
//	}
//	private void m4() {
//		System.out.println("m4 method");
//
//	}
//
//	public void m3() {
//		System.out.println("m3 method");
//	}
	
	int i=10;
	static int j=20;
	int k=30;
	static int l=40;
//	static{
//		System.out.println("m1 block");
//		
//	}
//	{
//		System.out.println("m4 block");
//	}
//	static{
//		System.out.println("m2 block");
//		
//	}
//	
//	{
//		System.out.println("m3 block");
//	}
//	
//	static{
//		System.out.println("m5 block");
//	}
	
	public static void main(int[] args) {
		Variabledemo ob = new Variabledemo();
		System.out.println(ob.i);
		System.out.println(ob.k);
		System.out.println(Variabledemo.j);
		System.out.println(Variabledemo.l);
		
	}

}

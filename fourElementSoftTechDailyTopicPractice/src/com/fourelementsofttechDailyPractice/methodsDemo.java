package com.fourelementsofttechDailyPractice;

import java.util.Scanner;

public class methodsDemo {
	int addres;
	int mulres;
	int subres;
	int divres;

	public static int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static int mul(int a, int b) {
		int c=a*b;
		return c;
	}
	public static int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	public static int div(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		methodsDemo obj = new methodsDemo();
		int addres=obj.add(a, b);
		int mulres= obj.mul(a, b);
		int subres=obj.sub(a, b);
		int divres=obj.div(a, b);
		System.out.println(obj);
		
		System.out.println(addres);
		System.out.println(mulres);
		System.out.println(subres);
		System.out.println(divres);
		

	}


}

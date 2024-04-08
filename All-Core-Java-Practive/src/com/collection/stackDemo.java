package com.collection;

import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
		Stack al = new Stack();
		al.add(5000);
		al.add("komal");
		al.add(34.56);
		al.add(45);
		al.add('a');
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		al.push("kalyani");
		System.out.println(al);
		System.out.println(al.pop());
		System.out.println(al);
		System.out.println(al.peek());
		System.out.println(al);
	}

}

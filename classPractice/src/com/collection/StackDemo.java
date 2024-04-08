package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(10);
		s.push(20);
		s.push(30);
		s.push("pallavi");
		s.push("komal");
		s.push(20.90);
		s.push(null);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.remove(2));
		System.out.println(s);


	}

}

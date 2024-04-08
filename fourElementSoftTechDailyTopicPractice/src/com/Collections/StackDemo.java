package com.Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1001);
		s.push("komal");
		s.push(10.12);
		s.push(1456987);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.firstElement());

	}

}

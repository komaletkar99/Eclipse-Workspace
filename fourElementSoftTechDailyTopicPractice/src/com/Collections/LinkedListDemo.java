package com.Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add("komal");
		l.add(30);
		l.add(40);
		l.add(10.42);
		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l.addAll(l));
		System.out.println(l.containsAll(l));
		System.out.println(l);
		
		

	}

}

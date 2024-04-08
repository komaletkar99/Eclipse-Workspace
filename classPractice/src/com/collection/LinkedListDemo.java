package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(20);
		al.add(10);
		al.add("xya");
		al.add('d');
		al.add(null);
		al.add(20.20);
		al.add(null);

		System.out.println(al);
	}

}

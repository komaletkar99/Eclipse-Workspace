package com.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet al = new HashSet();
	al.add(20);
	al.add(10);
	al.add("xya");
	al.add('d');
	al.add(null);
	al.add(20.20);
	al.add(20);
	al.add(10);
	al.add("xya");
	al.add('d');
	al.add(null);
	al.add(20.20);
	al.add(null);
	al.add(null);
	System.out.println(al);
	}

}

package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet al = new LinkedHashSet();
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

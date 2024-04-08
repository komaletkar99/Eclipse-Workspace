package com.collection;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		Mycomparator m = new Mycomparator();
		TreeSet t = new TreeSet(m);
		t.add(10);
		t.add(45);
		t.add(5);
		t.add(15);
		t.add(98);
		t.add(45);
		System.out.println(t);

	}

}

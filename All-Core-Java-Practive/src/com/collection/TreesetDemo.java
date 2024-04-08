package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		TreeSet  t = new TreeSet(new comparatorDemo());
		t.add(70);
		t.add(40);
		t.add(20);
		t.add(60);
		t.add(10);
		t.add(78);
		t.add(70);
		t.add(40);
		t.add(20);
		t.add(60);
		t.add(10);
		t.add(78);
		System.out.println(t);
	}

}

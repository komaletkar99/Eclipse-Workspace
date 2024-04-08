package com.Collections;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Mycomparator{

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MycomparatorDemo());
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

package com.map.interfacedemo.practice;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap t = new TreeMap();
		t.put("komal", 12);
		t.put("kalyani", 23);
		t.put("raosaheb", 89);
		t.put("pallavi", 34);
		t.put("yash", null);
		System.out.println(t);
		System.out.println(t.tailMap("yash"));
		System.out.println(t.headMap("yash"));
		System.out.println(t);
		System.out.println(t.subMap("komal", "yash"));
		
		

	}

}

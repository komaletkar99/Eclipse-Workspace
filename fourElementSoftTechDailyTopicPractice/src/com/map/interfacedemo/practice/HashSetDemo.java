package com.map.interfacedemo.practice;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add("komal");
		hs.add(90);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

	}

}

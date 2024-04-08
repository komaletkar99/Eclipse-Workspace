package com.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("komal");
		hs.add(1000);
		hs.add(23.45);
		hs.add(23);
		hs.add(null);
		hs.add('a');
		hs.add(null);
		//System.out.println(hs);

		hs.add(1000);
		hs.add(23.45);
		hs.add(23);
		hs.add(null);
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
	}

}

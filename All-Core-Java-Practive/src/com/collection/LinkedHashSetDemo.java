package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("komal");
		hs.add(1001);
		hs.add('a');
		hs.add(56.46);
		hs.add(67);
		hs.add(null);
		hs.add("komal");
		hs.add(1001);
		hs.add('a');
		hs.add(56.46);
		hs.add(67);
		hs.add(null);
		
		System.out.println(hs);

	}

}

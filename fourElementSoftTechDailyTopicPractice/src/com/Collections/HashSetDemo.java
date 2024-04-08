package com.Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add("komal");
		h.add('j');
		h.add(300);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		System.out.println(h.remove(300));
		System.out.println(h);

	}

}

package com.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add('j');
		h.add(100);
		h.add("komal");
		h.add(null);
		h.add("pooja");
		h.add(23.65);
		h.add(null);
		System.out.println(h);

	}

}

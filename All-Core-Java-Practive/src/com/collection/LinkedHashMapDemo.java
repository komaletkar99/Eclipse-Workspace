package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		hm.put("1001", 2);
		hm.put("komal", 3);
		hm.put("sarthak", 5);
		hm.put("pallavi", 9);
		hm.put("1001", 2);
		hm.put("komal", 3);
		hm.put("sarthak", 5);
		hm.put(2, 9);
		hm.put(null, hm);
		hm.put(null, null);
		System.out.println(hm);

	}

}

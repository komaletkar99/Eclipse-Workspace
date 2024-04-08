package com.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
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

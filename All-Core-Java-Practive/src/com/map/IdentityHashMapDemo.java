package com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
//		Integer i1 = new Integer(200);
//		Integer i2 = new Integer(200);
		String i1 = new String("puja");
		String i2 = new String("puja");
		
		map.put(i1, "komal");
		map.put(i2,"sarthak");
		
		System.out.println(map);
		
		
		IdentityHashMap hm = new IdentityHashMap();
		hm.put(i1, "komal");
		hm.put(i2, "sarthak");
		System.out.println(hm);
	}

}

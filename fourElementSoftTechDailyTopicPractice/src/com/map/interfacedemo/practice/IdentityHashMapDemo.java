package com.map.interfacedemo.practice;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Integer i1 = new Integer(200);
		Integer i2 = new Integer(200);
		hm.put(i1,"raosaheb");
		hm.put(i2, "komal");
		
		System.out.println(hm);
		

		IdentityHashMap map = new IdentityHashMap();
		map.put(i1, "raosaheb");
		map.put(i2, "komal");
		
		System.out.println(map);
	}

}

package com.concurrent.collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMapMethods {

	public static void main(String[] args) {
		ConcurrentHashMap hm = new ConcurrentHashMap();
		hm.put(1001, "komal");
		hm.putIfAbsent(1001, "rao");
		hm.remove(1001, "komal");
		
		System.out.println(hm);
		

	}

}

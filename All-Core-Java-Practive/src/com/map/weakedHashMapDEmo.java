package com.map;

import java.util.WeakHashMap;

public class weakedHashMapDEmo {

	public static void main(String[] args) {
		WeakHashMap hm = new WeakHashMap();
		TestWEakHashMap t1 = new TestWEakHashMap();
		TestWEakHashMap t2 = new TestWEakHashMap();
		TestWEakHashMap t3 = new TestWEakHashMap();
		TestWEakHashMap t4 = new TestWEakHashMap();
		
		hm.put(t1, "komal");
		hm.put(t2, "punam");
		hm.put(t3, "rao");
		hm.put(t4, "sarthak");
		t1=null;
		System.gc();
		System.out.println(hm);
	}

}

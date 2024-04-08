package com.map.interfacedemo.practice;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakedHashMapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		
		WeakHashMap map = new WeakHashMap();
		TestWeakedHashMapDemo t5 = new TestWeakedHashMapDemo();
		TestWeakedHashMapDemo t6 = new TestWeakedHashMapDemo();
		TestWeakedHashMapDemo t7 = new TestWeakedHashMapDemo();
		TestWeakedHashMapDemo t8 = new TestWeakedHashMapDemo();
		map.put(t5, "komal");
		map.put(t6, "pooja");
		map.put(t7, "pallavi");
		map.put(t8, "ritu");
		t6=null;
		t5=null;
		System.gc();
		System.out.println(map);

	}

}

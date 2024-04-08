package com.map.interfacedemo.practice;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("komal", 1001);
		ht.put("Kalyani", 1002);
		ht.put("vaibhav", 1003);
		ht.put(10, "ht");
		ht.put("komal", 1001);
		ht.put("Kalyani", 1002);
		ht.put("vaibhav", 1003);
		System.out.println(ht);
		
	}

}

package com.map.interfacedemo.practice;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
	Hashtable ht = new Hashtable();
	ht.put(new TestHashTableDemo(5), "komal");
	ht.put(new TestHashTableDemo(9),"sarthak");
	ht.put(new TestHashTableDemo(6), "raosaheb");
	ht.put(new TestHashTableDemo(4), "kalyani");
	ht.put("rao", "kalyani");
	//ht.put(null, null);
	
	
	System.out.println(ht);
	
	

	}

}

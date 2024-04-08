package com.collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
	Hashtable ht = new Hashtable();
	ht.put("komal",1002);
	ht.put(123, 8);
	ht.put("pooja",89);
	ht.put("komal",1002);
	ht.put(123, 8);
	ht.put("pooja",89);
	//ht.put(9, null);
	//ht.put(null, 67);
	System.out.println(ht);

	}

}

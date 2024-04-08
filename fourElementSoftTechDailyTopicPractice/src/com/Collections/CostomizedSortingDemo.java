package com.Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class CostomizedSortingDemo {

	public static void main(String[] args) {
		TreeMap t = new TreeMap(new CostomDemo());
		t.put("komal", 12);
		t.put("kalyani", 23);
		t.put("raosaheb", 89);
		t.put("pallavi", 34);
		t.put(9, null);
		t.put("komal", 12);
		t.put("kalyani", 23);
		t.put("raosaheb", 89);
		t.put("pallavi", 34);
		t.put(9, null);
		System.out.println(t);
	}

}

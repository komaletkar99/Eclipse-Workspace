package com.Collections;

import java.util.Comparator;

public class CostomDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return -s1.compareTo(s2);
		
	}


}

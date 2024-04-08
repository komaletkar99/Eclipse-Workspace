package com.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("pooja");
		s.add("komal");
		s.add("tanuja");
		s.add("ritu");
		s.add("anushka");
		s.add("rani");
		
		
		System.out.println(s);
		System.out.println(s.headSet("rani"));
		System.out.println(s.tailSet("anushka"));
		System.out.println(s.subSet("anushka", "tanuja"));
		
		
		
	}

}

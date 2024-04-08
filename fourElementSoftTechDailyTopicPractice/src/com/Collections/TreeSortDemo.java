package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSortDemo {

	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(100);
		s.add(400);
		s.add(100);
		s.add(null);
		System.out.println(s);

	}

}

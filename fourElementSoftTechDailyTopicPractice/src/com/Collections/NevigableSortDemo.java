package com.Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NevigableSortDemo {

	public static void main(String[] args) {
		NavigableSet n = new TreeSet();
		n.add(300);
		n.add(400);
		n.add(100);
		n.add(200);
		n.addAll(n);
		System.out.println(n);

	}

}

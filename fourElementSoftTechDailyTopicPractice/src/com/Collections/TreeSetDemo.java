package com.Collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add(10);
	t.add(20);
	//t.add("komal");
	t.add(50);
	t.add(40);
	t.add(5);
	System.out.println(t.headSet(20));
	System.out.println(t.tailSet(20));
	
	double a = 10;
	int d = (int) a;
	System.out.println(d);

	}

}

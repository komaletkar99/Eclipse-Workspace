package com.concurrent.collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayListMethods {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add("komal");
		al.add("pallavi");
		al.add(1001);
		al.addIfAbsent("kalyani");
		al.remove(2);
		
		System.out.println(al);

	}

}

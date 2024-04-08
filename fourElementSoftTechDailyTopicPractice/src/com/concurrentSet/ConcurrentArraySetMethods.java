package com.concurrentSet;

import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentArraySetMethods {

	public static void main(String[] args) {
		CopyOnWriteArraySet s = new CopyOnWriteArraySet();
		s.add("sarthak");
		s.add("kalyani");
		s.add("sarthak");
		s.add("kalyani");
		
		s.remove("kalyani");
		System.out.println(s);
		
	}

}

package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(100);
		s.add(400);
		s.add(200);
		s.add(700);
		s.add(300);
		s.add(900);
		s.add(100);
		

			
		System.out.println(s);
		
		int x = 10;
		int y = x++ + ++x + --x + x-- + x++ + --x; //10 + 12 + 11 + 11 + 10 + 10
		System.out.println(y);
		
	}

}

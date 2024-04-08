package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(100);
		s.add("komal");
		s.add('i');
		s.add(200);
		s.add(null);
		s.add(300);
		s.add(null);
	
		System.out.println(s);

	}

}

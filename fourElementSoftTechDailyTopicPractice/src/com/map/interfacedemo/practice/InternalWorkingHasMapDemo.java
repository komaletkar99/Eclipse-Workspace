package com.map.interfacedemo.practice;

import java.util.HashMap;
import java.util.Map;

public class InternalWorkingHasMapDemo {

	public static void main(String[] args) {
		String s1="Kalyani";
		String s2 ="Vaibhav";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		 Map<Integer,String> m = new HashMap<Integer,String>();
			m.put(1001, "pallavi");
			m.put(1002, "etkar");
			m.put(1003, "komal");
			m.put(1004, "punam");
			System.out.println(m);

	}

}

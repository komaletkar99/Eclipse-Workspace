package com.map.interfacedemo.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "komal");
		m.put(null, null);
		m.put(null, "pallavi");
		m.put("2", "etkar");
		m.put("komal", "raosaheb");
		m.put(4, "kalyani");
		System.out.println(m.put(1, "komu"));
		
		m.put(1, "komal");
		m.put(null, null);
		m.put(null, "pallavi");
		m.put("2", "etkar");
		m.put("komal", "raosaheb");
		m.put(4, "kalyani");
		System.out.println(m.put(1, "komu"));
		
		
		System.out.println(m);
		
		LinkedHashMap l = new LinkedHashMap();
		l.putAll(m);
		System.out.println(m.replace(null, "pooja"));
		System.out.println(m);
		//System.out.println(l);
		Set entrySet = m.entrySet();
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)iterator.next();
			System.out.println(map.getKey() + ":" + map.getValue());
			
//			if(map.getKey().equals(4)) {
//				map.setValue("pritam");
//			}
		}
		
		

	}

}

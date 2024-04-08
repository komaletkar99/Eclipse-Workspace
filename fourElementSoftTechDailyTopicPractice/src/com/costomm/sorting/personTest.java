package com.costomm.sorting;

import java.util.Map;
import java.util.TreeMap;

public class personTest {
	public static void main(String[] args) {
		
		TreeMap<person,String> personMap = new TreeMap<person,String>();
		
		person p1 = new person("Sagar", 35);
		personMap.put(p1, "BA");
		personMap.put(new person("Pallavi", 23), "Developer");
		personMap.put(new person("Anup", 27), "Tester");
		personMap.put(new person("Vaibhav", 21), "Devops");
		personMap.put(new person("Anup", 25), "Tester");
		personMap.put(new person("Komal", 26), "Engineer");
		
		System.out.println(personMap);
		System.out.println("===================================");
		for(Map.Entry<person, String> entry: personMap.entrySet()) {
		System.out.println(entry.getKey() +  " - " + entry.getValue());	
			
		}
	}
	}


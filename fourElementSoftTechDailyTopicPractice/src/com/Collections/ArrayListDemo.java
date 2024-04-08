package com.Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	//int id;
	String name;
	
	public ArrayListDemo(String name) {
		//this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add("komal");
//		al.add(200);
//		al.add(null);
//		al.add("rao");equals(ob2))
//		al.add(null);
//		al.add("komal");
//		al.add(200);
//		
//		ArrayList al1 = new ArrayList();
//		al1.add(300);
//		al1.add(400);
//		al1.add(1,al);
//		System.out.println(al1.contains(200));
//		System.out.println(al1);
//		
		
//		String str = "India is my country";
//		String[] words = str.split(" ");
//		for(String word : words) {
//			System.out.print(word);
//		}
		String str = new String("java");
		String str1 = new String("java");
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		ArrayListDemo ob1 = new ArrayListDemo("komal");
		ArrayListDemo ob2 = new ArrayListDemo("komal");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1==ob2);
		
	}

}

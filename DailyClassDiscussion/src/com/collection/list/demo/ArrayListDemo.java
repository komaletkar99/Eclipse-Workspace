package com.collection.list.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(null);
		al.add(50);
		al.add(null);
		al.add(10);
		al.add(null);
		al.add(50);
		al.add(null);
		System.out.println(al);
		for(Object ol : al) {
			System.out.print(ol + " ");
		}

	}

}

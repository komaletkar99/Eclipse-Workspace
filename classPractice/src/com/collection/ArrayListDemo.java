package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(10);
		al.add("xya");
		al.add('d');
		al.add(null);
		al.add(20.20);
		al.add(null);
		Object[] res=al.toArray();
		System.out.println(Arrays.toString(res));
		
		

	}

}

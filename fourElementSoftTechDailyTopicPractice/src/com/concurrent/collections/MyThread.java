package com.concurrent.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("komal");
		al.add("sarthak");
		al.add("monika");
		al.add("rao");
		al.add("kalyani");
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object i1 = itr.next();
			if(i1.equals("komal")) {
				itr.remove();
			}
		}
		System.out.println(al);

	}

}

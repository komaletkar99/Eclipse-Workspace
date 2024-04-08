package com.concurrentCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMapdemo extends Thread{
	static ConcurrentHashMap hm = new ConcurrentHashMap();
	@Override
	public void run() {
		hm.put(3, "komal");
		hm.put(2, "pallavi");
		System.out.println("child thread updating map");
	}

	public static void main(String[] args) {

		hm.put(1, "komal");
		hm.put(4, "pallavi");
		hm.put(5, "ritu");
		hm.put("pavan", 20);
		
		concurrentHashMapdemo ob = new concurrentHashMapdemo();
		ob.start();
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object i1 = itr.next();
			System.out.println("main thread iterating collection : " + i1);
		}
		System.out.println("final list : " + hm);
		

	}

}

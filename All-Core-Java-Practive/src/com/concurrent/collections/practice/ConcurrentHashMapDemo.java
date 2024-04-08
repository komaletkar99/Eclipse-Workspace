package com.concurrent.collections.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{
	static ConcurrentHashMap hm = new ConcurrentHashMap();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hm.put("komal", 22);
		hm.put(12, 67);
		System.out.println("child thread updating list");
	}


	public static void main(String[] args) throws InterruptedException {
		hm.put("veera", 78);
		hm.put("vanita", "komal");
		hm.put(23, "sarthak");
		hm.put(12, "90");
		
		ConcurrentHashMapDemo ob = new ConcurrentHashMapDemo();
		ob.start();
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			 Object i1 = itr.next();
			 System.out.println("main thread updating collection " + i1);
			 Thread.sleep(2000);
		} 

		System.out.println("final list : " + hm);
	}

}

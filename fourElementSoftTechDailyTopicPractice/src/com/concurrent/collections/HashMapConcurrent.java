package com.concurrent.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcurrent extends Thread{
	static ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<String, Integer>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating map....");
		hm.put("tanu", 45);
		hm.put("monika", 90);
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		hm.put("komal", 23);
		hm.put("pallavi", 26);
		hm.put("sarthak", 56);
		hm.put("kalyani", 34);
		hm.put("rao", 12);
		hm.put("yash", 29);
		
		HashMapConcurrent t = new HashMapConcurrent();
		t.start();
		
		Set set = hm.keySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Object i1 = itr.next();
			System.out.println("Main thread iterating entries and current entry is : " + i1 + hm.get(i1));
			Thread.sleep(2000);
		}
		
		System.out.println("Final list : " + hm);
	}

}

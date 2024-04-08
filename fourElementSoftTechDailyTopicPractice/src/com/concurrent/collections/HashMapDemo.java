package com.concurrent.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo extends Thread {
	static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	//static HashMap hm= new HashMap();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hm.put("tanu", 45);
		hm.put("monika", 90);
		
		System.out.println("child thread executing");
	}

	public static void main(String[] args) throws InterruptedException {
		hm.put("komal", 23);
		hm.put("pallavi", 26);
		hm.put("sarthak", 56);
		hm.put("kalyani", 34);
		hm.put("rao", 12);
		hm.put("kalyani", 34);
		hm.put("rao", 12);
		//hm.put(45, 29);
		
		HashMapDemo t = new HashMapDemo();
		t.start();
		Set<Entry<String, Integer>> set = hm.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();

		while(itr.hasNext()) {
			Thread.sleep(2000);
			itr.next();
			System.out.println("main thead executing");
		}
		
		
		System.out.println(hm);
		//System.out.println("final list " + hm);

	}

}

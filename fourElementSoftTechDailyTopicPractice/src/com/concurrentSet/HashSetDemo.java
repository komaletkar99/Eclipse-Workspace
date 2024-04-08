package com.concurrentSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo extends Thread{
	
	static HashSet h = new HashSet();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("child thread updating set");
		h.add("pooja");
		h.add("amruta");
	}

	public static void main(String[] args) throws InterruptedException {
		h.add("sarthak");
		h.add("kalyani");
		h.add(1003);
		h.add("monika");
		
		HashSetDemo t = new HashSetDemo();
		t.start();
		
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			Object o1 = itr.next();
			
			Thread.sleep(2000);
			
			System.out.println("Main thread executing..." + " " + o1);
		}
		System.out.println("Final set is : " + h);
		
		

	}

}

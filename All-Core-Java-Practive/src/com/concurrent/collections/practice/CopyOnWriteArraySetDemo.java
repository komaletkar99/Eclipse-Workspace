package com.concurrent.collections.practice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo extends Thread{

	static CopyOnWriteArraySet al = new CopyOnWriteArraySet();
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		al.add("puja");
		al.add("pritam");
		System.out.println("child thread updating list");
	}


	public static void main(String[] args) throws InterruptedException {
		al.add(29);
		al.add(23.45);
		al.add("rani");
		al.add("monika");
		
		CopyOnWriteArraySetDemo ob = new CopyOnWriteArraySetDemo();
		ob.start();
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object i1 = itr.next();
			System.out.println("main thread iterating collection");
			Thread.sleep(2000);
	}

		System.out.println("final arrayset : " + al);


	}

}

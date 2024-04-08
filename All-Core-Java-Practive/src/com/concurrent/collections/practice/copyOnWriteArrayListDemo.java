package com.concurrent.collections.practice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayListDemo extends Thread{
 static CopyOnWriteArrayList al = new CopyOnWriteArrayList();
 @Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread executing ..");
		al.add("kalyani");
		al.add(27);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		al.add("puja");
		al.add("sarthak");
		al.add(23);
		al.add(null);
		Thread.sleep(2000);
		System.out.println("list before iterating" + al);
		copyOnWriteArrayListDemo ob = new copyOnWriteArrayListDemo();
		ob.start();
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object i1 = itr.next();
			System.out.println("main thread iterating collection " + i1);
			Thread.sleep(2000);
		}
		System.out.println("final List : " + al);
	}
}

package com.concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArrayListDemo extends Thread{
	static CopyOnWriteArrayList al = new CopyOnWriteArrayList();

	@Override
	public void run() {
		al.add("komal");
		al.add("pallavi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("child block updating clooection");
	}

	public static void main(String[] args) throws InterruptedException {
		al.add("nikita");
		al.add(20);
		al.add(80);
		al.add("punam");
		al.add("nikita");
		al.add(20);
		al.add(80);
		al.add("punam");
		copyOnWriteArrayListDemo ob = new copyOnWriteArrayListDemo();
		ob.start();
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object i1 = itr.next();
			System.out.println("main thread itrating collection" + i1);
			Thread.sleep(2000);
		}
		
		System.out.println("final list : " + al);
	}

}

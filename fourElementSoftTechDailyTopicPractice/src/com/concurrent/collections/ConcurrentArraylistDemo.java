package com.concurrent.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArraylistDemo extends Thread{
	static CopyOnWriteArrayList al = new CopyOnWriteArrayList();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.add("komal");
		al.add(1001);
		System.out.println("child thread updating list");
	}


	public static void main(String[] args) throws InterruptedException {
		al.add("sarthak");
		al.add("monika");
		al.add("rao");
		al.add("kalyani");
		
		ConcurrentArraylistDemo t = new ConcurrentArraylistDemo();
		t.start();
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object i1 = itr.next();


			System.out.println("Main thread updating list" + " " + i1);
			Thread.sleep(2000);
		}
		System.out.println("Final list is : " + al);

	}

}
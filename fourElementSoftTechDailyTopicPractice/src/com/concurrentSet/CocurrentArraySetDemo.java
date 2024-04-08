package com.concurrentSet;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CocurrentArraySetDemo extends Thread{
	
	static CopyOnWriteArraySet al = new CopyOnWriteArraySet();
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.add("sarthak");
		al.add(9876);
		al.add("kalyani");
		al.add("monika");
		
		System.out.println("Child thread updating list ");
		
	}
	

	public static void main(String[] args) throws InterruptedException {
	al.add("amruta");
	al.add("punam");
	al.add("monika");
	al.add("sarthak");
	
	CocurrentArraySetDemo t = new CocurrentArraySetDemo();
	t.start();
	
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		Object i1 = itr.next();
		if(al.equals("punam"))
		{
			itr.remove();
		}
		System.out.println("Main thread adding list " + " " + i1);
		Thread.sleep(2000);
	}
	
	System.out.println("Final list : " + al);

	}

}

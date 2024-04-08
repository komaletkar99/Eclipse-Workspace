package com.ThreadMethod.Assignments;

public class MyThread extends Thread{
	@Override
	public void run() {
		//Thread.yield();
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
	synchronized public void Show() {
		System.out.println("Invoking the wait method");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("continuning the wait method invoking..");
		
	}
	synchronized public void Display() {
		System.out.println("Invoking thread using notify()");
		//notify();
		notifyAll();
	}
	


}

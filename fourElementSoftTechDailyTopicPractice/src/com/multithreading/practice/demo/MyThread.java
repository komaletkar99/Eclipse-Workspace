package com.multithreading.practice.demo;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread executing");
		}
	}

	
	public void run(int x) {
		
			System.out.println("overloaded run method executing");
		
	}


	@Override
	public synchronized void start() {
		System.out.println("overloaded start method executing");

	}
	
	

}

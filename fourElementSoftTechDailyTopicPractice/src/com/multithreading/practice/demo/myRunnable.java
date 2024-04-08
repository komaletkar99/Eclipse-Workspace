package com.multithreading.practice.demo;

public class myRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child THREAD EXECUTING");
		}
		
	}
//	
//	public void run(int x) {
//		for(int i=0;i<5;i++) {
//			System.out.println("Child THREAD EXECUTING");
//		}
//		
//	}

}

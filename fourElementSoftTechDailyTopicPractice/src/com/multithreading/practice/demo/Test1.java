package com.multithreading.practice.demo;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myRunnable t = new myRunnable();
		Thread t1 = new Thread(t);
		t1.start();
		
		
			for(int i=0;i<5;i++) {
				System.out.println("Main THREAD EXECUTING");
			}
	

	}

}

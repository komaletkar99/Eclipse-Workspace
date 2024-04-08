package com.synchronization.practice.demo;
public class test extends Thread {
	@Override
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println("good morning");
		}
	}

	public static synchronized void  main(String[] args) {
		test t = new test();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("priti");
		}

}
}
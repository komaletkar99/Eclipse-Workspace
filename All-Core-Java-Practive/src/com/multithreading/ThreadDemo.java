package com.multithreading;

public class ThreadDemo extends Thread{
	static Thread mt;
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("child thread");
//			System.out.println(mt.getPriority());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo.mt = Thread.currentThread();
		ThreadDemo t = new ThreadDemo();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
			sleep(2000);
		}

	}

}

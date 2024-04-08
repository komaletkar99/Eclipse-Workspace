package com.multithreading;

public class MyThread extends Thread{
	Thread mt;
	@Override
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			//Thread.yield();
			System.out.println("child thread");
//			System.out.println(mt.getPriority());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo.mt = Thread.currentThread();
		ThreadDemo t = new ThreadDemo();
		t.start();
		t.join();

		for(int i=0;i<5;i++) {
			sleep(2000);
			System.out.println("main thread");
	
		}

	}

}

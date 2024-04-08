package com.multithreading;

public class Test extends Thread{
	
	static Thread t;

	@Override
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test.t = Thread.currentThread();
		Test t1 = new Test();
		t1.start();
		//t1.join();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}

	}

}

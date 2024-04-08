package com.multithreading;
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("komal");
		}
		
	}
	
	
}
public class runabbleDemo {

	public static void main(String[] args) {
	MyRunnable r = new MyRunnable();
	Thread t = new Thread(r);
	t.start();
		for(int i=0;i<5;i++) {
			System.out.println("etkar");
		}

	}

}

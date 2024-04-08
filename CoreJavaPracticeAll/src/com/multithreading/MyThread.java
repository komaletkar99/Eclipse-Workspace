package com.multithreading;
class ThreadDemo extends Thread{
	static Thread mt;
	@Override
	public void run() {
//		try {
//			mt.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=0;i<5;i++) {
			//mt.yield();
			System.out.println("komal");
		}
	}
	
}

public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo.mt=Thread.currentThread();
		//System.out.println(Thread.currentThread().getPriority());
		ThreadDemo d = new ThreadDemo();
		d.start();
		for(int i=0;i<5;i++) {
			d.join();
			System.out.println("pallavi");
		}

	}

}

package com.synchronization.practice.demo;
class ThreadDemo extends Thread{
	display d;
	String name;
	public ThreadDemo(display d, String name) {
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		d.show(name);
	}
	
}

class display{
	public synchronized void show(String name) {
		for(int i=0;i<5;i++) {
		System.out.print("good evening : ");
		System.out.println(name);
	}
		System.out.println();
	}
}
public class Synchronizationdemo {

	public static void main(String[] args) {
	display d = new display();
	ThreadDemo t1 = new ThreadDemo(d, "komal");
	ThreadDemo t2 = new ThreadDemo(d, "pooja");
	t1.start();
	t2.start();

	}

}

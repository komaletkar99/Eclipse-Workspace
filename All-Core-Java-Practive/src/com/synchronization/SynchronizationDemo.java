package com.synchronization;

class parent extends Thread{
	String name;
	display d;
	
	
	public parent(display d,String name) {
		this.name = name;
		this.d = d;
	}


	@Override
	public void run() {
		d.show(name);
	}
	
	
}
class display{
	public synchronized void show(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("Good morning:" + " ");
			System.out.println(name);
		}
		System.out.println();
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		display d = new display();
		parent p =new parent(d,"komal");
		parent p1 =new parent(d,"puja");
		p.start();
		p1.start();


	}

}

package com.synchronization;
class display11 extends Thread{
	String name;
	parent11 p;
	public display11(parent11 p, String name) {
		this.name = name;
		this.p = p;
	}
	@Override
	public void run() {
		try {
			p.show(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

class parent11{
	public synchronized void show(String name) throws InterruptedException {
		for(int i=0;i<5;i++) {
		System.out.print("good morning:" + " ");
		Thread.sleep(2000);
		System.out.println(name);
	}
	}
}
public class Practice {

	public static void main(String[] args) {
		parent11 p = new parent11();
		display11 d = new display11(p, " komal");
		display11 d1 = new display11(p, "rao");
		d.start();
		d1.start();

	}

}

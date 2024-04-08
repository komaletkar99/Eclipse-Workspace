package com.synchronization;
class Test extends Thread{
	String name;
	child d;
	public Test(child d, String name) {
		this.name = name;
		this.d = d;
	}
	@Override
	public void run() {
		d.showMSG(name);
	}
	
	
}
class child{
	public synchronized void showMSG(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("hiiii ");
			System.out.println(name);
		}
		System.out.println();
	}
	
}

public class SynchroniedDemo {

	public static void main(String[] args) {
		child c = new child();
		Test p = new Test(c,"pallavi");
		Test p1 = new Test(c,"komal");
		Test p2 = new Test(c,"sarthak");
		Test p4 = new Test(c,"puja");
		
		p.start();
		p1.start();
		p2.start();
		p4.start();
		
		

	}

}

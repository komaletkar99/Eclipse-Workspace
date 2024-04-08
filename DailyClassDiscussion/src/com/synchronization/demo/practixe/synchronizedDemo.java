package com.synchronization.demo.practixe;

//import com.synchrinized.practice.display;

class MyThread extends Thread{
	display d;
	String name;
	
	public MyThread(display d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}

	
}

class display{
	public synchronized void wish(String name) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.print("good morning : ");
			//Thread.sleep(2000);
			System.out.println(name);
		}
		
		
	}
}

public class synchronizedDemo {

	public static void main(String[] args) {
		display ob = new display();
		MyThread d = new MyThread(ob,"Komal");
		MyThread d1 = new MyThread(ob,"Pallavi");
		d.start();
		d1.start();

	}

}

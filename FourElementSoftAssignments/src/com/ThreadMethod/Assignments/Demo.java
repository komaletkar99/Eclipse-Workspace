package com.ThreadMethod.Assignments;

public class Demo extends Thread {
	static Thread mt;

	@Override
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child thread executing");
		}
	}

}

package com.ThreadMethod.Assignments;

public class TestMyThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		mt.Show();
		mt.Display();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread executing");
		}

	}

}

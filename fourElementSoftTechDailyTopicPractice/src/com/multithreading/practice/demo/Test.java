package com.multithreading.practice.demo;

public class Test {

	public static void main(String[] args) {
		MyThread t =new  MyThread();
		t.start();
		t.run(10);
		for(int i=0;i<5;i++) {
			System.out.println("main thread executing");
		}

	}

}

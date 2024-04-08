package com.exceptiondemo;
public class CustomizedEWxceptionDemo {

	public void show() throws Exception{
		throw new ArithmeticException("invalid amount exception");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizedEWxceptionDemo ob = new CustomizedEWxceptionDemo();
		try {
			ob.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package com.interfaceedmo;

public class Test {

	public static void main(String[] args) {
		Bank b = new Hdfc();
		b.deposite(5000);
//		b.withdraw(2000);
		System.out.println("withdraw amount is " + b.withdraw(2000));
		b.balEnquary();
	

	}

}

package com.interfaceDemo;

public abstract  class abstractDemo implements InterfaceDemo {

	double balance;
	@Override
	public abstract void deposite(double amount);

	@Override
	public void balanceEnquary() {
		System.out.println("available balance is : " + balance);
		
	}
	public abstract double withdraw(double amount);
	
}

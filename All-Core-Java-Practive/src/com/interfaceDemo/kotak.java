package com.interfaceDemo;

public class kotak extends abstractDemo{

	double balance;

	@Override
	public void deposite(double amount) {
		balance += amount;
		System.out.println("deposited amount is : " + balance);
		
	}

	@Override
	public double withdraw(double amount) {
		balance -= amount;
				return amount;
	}


	
}

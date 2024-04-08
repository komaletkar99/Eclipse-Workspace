package com.interfaceedmo;

public abstract class kotak implements Bank{
	double balance;
	@Override
	public double withdraw(double amount) {
		balance -= amount;
		return amount;
	}

	@Override
	public void deposite(double amount) {
		balance += amount;
		System.out.println("deposite amount is " + amount);
		
	}

	@Override
	public abstract void balEnquary();

	
}

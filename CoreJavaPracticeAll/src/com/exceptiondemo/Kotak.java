package com.exceptiondemo;

public class Kotak implements Bank{
	 double balance;

	@Override
	public void deposite(double amount) throws InvalidAmountException{
		if(amount<=0) {
		throw new InvalidAmountException(amount + "Please provid valid amount" );
		}
		balance += amount;
		System.out.println("deposite amount is " + amount);
		balenquiry();
		}

	@Override
	public double withdraw(double amount) throws insufficientAmountException {
		if(balance < amount) {
			throw new insufficientAmountException("provide fund is insufficient");
		}
		 balance -= amount;
		 return balance;
		
	}

	@Override
	public void balenquiry() {
		System.out.println("available balance is : " + balance);
		
	}

}

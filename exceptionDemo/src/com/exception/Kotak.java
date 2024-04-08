package com.exception;

public class Kotak implements Bank{
	double balance=0;
	@Override
	public double deposite(double amount) throws invalidAmountException {
		if(amount < 0) {
			throw new invalidAmountException("Please enter valid amount");
			
		}
	 balance+=amount;
		return amount;
		
	}

	@Override
	public double withdraw(double amount) throws insufficientFundException {
		if(amount>balance)
		{
			throw new insufficientFundException("Provided ballance is not sufficiend");
		}
		balance -= amount;
		return amount;
	}

	@Override
	public void balanceenquiry() {
		System.out.println("available balance is : " + balance);
	}

}

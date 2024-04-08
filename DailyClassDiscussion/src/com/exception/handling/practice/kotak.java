package com.exception.handling.practice;

public class kotak implements Bank {
	public double balance;
	@Override
	public void deposite(double amount)throws InsufficientBalanceException {
		if(amount<0) {
			throw new InsufficientBalanceException("provided amount is invalid");
		}
		balance += amount;
		
	}
	@Override
	public double withdraw(double amount) throws InvalidAmounteException {
		if(balance<amount) {
			throw new InvalidAmounteException("Insufficient balance in your account");
		}
		balance -= amount;
		return amount;
	
	}
	@Override
	public void balanceEnquairy() {
		System.out.println("available balance is : " + balance);
		
	}

	

}

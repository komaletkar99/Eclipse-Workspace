package com.exceptionhandling.miniproject;

public class Hdfc implements Bank{
	private double balance;

	@Override
	public void DepositeAmount(double amount) throws  InvalidAmountException{
		if(amount <= 0) {
			throw new InvalidAmountException(amount + "Privide fund is invalid");
		}
		balance = balance + amount;
		
	}

	@Override
	public double WithdrawAmount(double amount) throws InsufficientFundException {
	if(balance < amount) {
		throw new InsufficientFundException(amount + "Insufficient balance in your account");
	}
		balance -= amount;
		return balance;
	}

	@Override
	public void BalanceEnquiery() {
		System.out.println("your available balance : " + balance);
		
	}

}

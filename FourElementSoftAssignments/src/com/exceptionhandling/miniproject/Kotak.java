package com.exceptionhandling.miniproject;

public class Kotak implements Bank {
	private double balance;

	@Override
	public double WithdrawAmount(double amount) throws InsufficientFundException {
		if(balance < amount) {
			throw new InsufficientFundException(amount + "Insufficient fund in your account");
			
		}
		balance = balance - amount;
		return balance;
	}

	@Override
	public void DepositeAmount(double amount) throws InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException(amount + "Provided amount is invalid");
		}
		balance = balance + amount;
		
	}

	@Override
	public void balanceEnquary() {
		System.out.println("Your available Account Balance is : " + balance);
		
	}

}

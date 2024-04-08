package com.Exception.handlin.practice;

public class kotak implements Bank{
	double balance;
	
	@Override
	public void depositeAmount(double amount) throws InvalidAmountException {
		if(amount <= 0) {
		throw new InvalidAmountException("please provide valid amount");
		}
		balance += amount;
	}

	@Override
	public double WithdrawAmount(double amount) throws InsufficientAmountException{
		if(balance < amount)
		{
			throw new InsufficientAmountException("available balance is insufficient");
		}
		balance -= amount;
		return amount;
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Available balance is : " + balance);
		
	}

}

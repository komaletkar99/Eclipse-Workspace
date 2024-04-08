package com.exceptionhandling.miniproject;

public interface Bank {
	public void DepositeAmount(double amount) throws InvalidAmountException;
	public double WithdrawAmount(double amount) throws InsufficientFundException;
	public void BalanceEnquiery();

}

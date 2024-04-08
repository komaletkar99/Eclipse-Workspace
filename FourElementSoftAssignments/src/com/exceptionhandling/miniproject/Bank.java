package com.exceptionhandling.miniproject;

public interface Bank {
	public double WithdrawAmount(double amount) throws InsufficientFundException;
	public void DepositeAmount(double amount) throws InvalidAmountException;
	public void balanceEnquary();

}

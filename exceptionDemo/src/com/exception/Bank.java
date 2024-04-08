package com.exception;

public interface Bank{
	public double deposite(double amount) throws invalidAmountException;
	public double withdraw(double amount) throws insufficientFundException;
	public void balanceenquiry();

}

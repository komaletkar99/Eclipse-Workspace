package com.exception.handling.practice;

public interface Bank{
	//public static final double balance = 0;
	public abstract void deposite(double amount)throws InsufficientBalanceException;
	public double withdraw(double amount) throws InvalidAmounteException;
	public void balanceEnquairy();
	

}

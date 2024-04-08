package com.exceptiondemo;

public interface Bank {
	public void deposite(double amount) throws InvalidAmountException;
	public double withdraw(double amount) throws insufficientAmountException;
	public void balenquiry();
	

}

package com.oopsConcept.Demo;

public class AbstractDemo2 implements InterfaceDemo{
	private double balance;
	@Override
	public double deposite(double dempositeAmount) {
		return balance = balance + dempositeAmount; 
		
	}

	@Override
	public double withdrawAmount(double amount) {
		balance = balance - amount;
		return balance;
		
	}

	@Override
	public void balanceEnquairy() {
		System.out.println("your available balance is : " + balance);
		
	}
	
	public void balanceEnquairy(int balance) {
		System.out.println("your c balance is : " + balance);
		
	}
	
	

}

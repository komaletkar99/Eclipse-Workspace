package com.exception;

public class Test {

	public static void main(String[] args) throws invalidAmountException, insufficientFundException {
		double balance;
		Kotak k = new Kotak();
		System.out.println("Deposited amount is : " + k.deposite(7000));
		System.out.println("Withdraw amount is : " + k.withdraw(2000));
		k.balanceenquiry();
	}

}

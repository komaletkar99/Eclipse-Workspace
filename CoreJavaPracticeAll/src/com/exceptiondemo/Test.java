package com.exceptiondemo;

public class Test {

	public static void main(String[] args) {
		Kotak ob = new Kotak();
		try {
		ob.deposite(10000);
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
		
		}
		try {
			double withdrawamount = ob.withdraw(6000);
			System.out.println("withdraw amount is " + withdrawamount);
			ob.balenquiry();
		} catch (insufficientAmountException e) {
			
		}
		ob.balenquiry();
	}

}

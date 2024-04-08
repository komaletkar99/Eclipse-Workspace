package com.Exception.handlin.practice;

import java.util.Scanner;

public class MyThreadDemo {

	public static void main(String[] args) {
		try {
	Bank b = new kotak();
	Scanner sc = new Scanner(System.in);
	String option = "";
	
	do {
		System.out.println("1. Deposite Amount");
		System.out.println("1. Withdraw Amount");
		System.out.println("1. Deposite AmounBalance enquiry");
		System.out.println("Please enter your choice : ");
		option=sc.next();
		
		switch(option) {
		case "1": {
			System.out.println("enter deposite amount : ");
			double amount = sc.nextDouble();
			b.depositeAmount(amount);
			System.out.println("deposited amount is : " + amount);
			b.balanceEnquiry();
			break;
		}
		case "2": {
			System.out.println("enter Withdraw amount : ");
			double amount = sc.nextDouble();
			double WithdrawAmount = b.WithdrawAmount(amount);
			System.out.println("Withdraw amount is : " + WithdrawAmount);
			b.balanceEnquiry();
			break;
		}
		case "3": {
			b.balanceEnquiry();
			break;
		}
		default:
			System.out.println("Please choice valid option");
		}
		System.out.println("Do you want to continue (Yes/no)");
		option=sc.next();
	}
	while(option.equalsIgnoreCase("YES"));
	}
		catch (InsufficientAmountException ife) {
			System.out.println(ife.getMessage());
		}
		catch (InvalidAmountException iae) {
			System.out.println(iae.getMessage());
		}


	}

}

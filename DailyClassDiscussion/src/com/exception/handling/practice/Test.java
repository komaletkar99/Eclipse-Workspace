package com.exception.handling.practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
	Bank b = new kotak();
	Scanner sc = new Scanner(System.in);
	String opt = "";
	do {
		System.out.println("1. Deposite amount");
		System.out.println("2. withdraw amount");
		System.out.println("3. Balance enquiry");
		System.out.println("enter you choice");
		opt = sc.next();
		
		switch(opt) {
		case "1":{
			System.out.println("Enter deposite amount: ");
			double amount = sc.nextDouble();
			b.deposite(amount);
			b.balanceEnquairy();
			break;
		}
		
		case "2":{
			System.out.println("Enter withdraw amount : ");
			double amount = sc.nextDouble();
			double withdrawAmount = b.withdraw(amount);
			System.out.println("Withdraw amount is : " + withdrawAmount);
			b.balanceEnquairy();
			break;
			}
		case "3":{
			b.balanceEnquairy();
			break;
		}
		default:
			System.out.println("please provide valid choice" );
		}
		System.out.println("Do you want to continue yes/no");
		opt=sc.next();
		}
	while(opt.equalsIgnoreCase("yes"));
	}
	catch(InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
	catch(InvalidAmounteException e) {
		System.out.println(e.getMessage());
	}

	}

}

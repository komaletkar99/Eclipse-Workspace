package com.exceptionhandling.miniproject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
		Bank ob = new Hdfc();
		Scanner sc = new Scanner(System.in);
		String option ="";
		
		do {
			System.out.println("1. Deposite Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Balance enquairy");
			System.out.println("Please enter your choice");
			option=sc.next();
			
			switch (option) {
			case "1": {
				System.out.println("Enter deposite ammount");
				double amount = sc.nextDouble();
				ob.DepositeAmount(amount);
				ob.BalanceEnquiery();
				break;
			}
			
			case "2":{
				System.out.println("Enter withdraw amount");
				double amount = sc.nextDouble();
				double withdrawamount = ob.WithdrawAmount(amount);
				System.out.println("withdraw amount is : " + withdrawamount);
				ob.BalanceEnquiery();
				break;
			}
			case "3":{
				ob.BalanceEnquiery();
				break;
			}
			default:
				System.out.println("Please enter correct choice");
			}
			System.out.println("Do you want to continue (YES/NO)");
			option=sc.next();
			
		} while (option.equalsIgnoreCase("yes"));
		}
		catch (InsufficientFundException ife) {
			System.out.println(ife.getMessage());
		}
		catch (InvalidAmountException iae) {
			System.out.println(iae.getMessage());
		}

	}

}

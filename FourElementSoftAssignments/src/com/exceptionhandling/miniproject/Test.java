package com.exceptionhandling.miniproject;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
		Bank ob = new Kotak();
		Scanner sc = new Scanner(System.in);
		String option = "";
		
		do {
			System.out.println("1. Withdraw Amount");
			System.out.println("2. Deposite Amount");
			System.out.println("3. Balance enquairy");
			System.out.println("Enter your choice : ");
			option = sc.next();
			
			switch (option) {
			case "1": {
				System.out.println("Enter withdraw amount :");
				double amount = sc.nextDouble();
				double withdrawAmount = ob.WithdrawAmount(amount);
				System.out.println("Withdraw amount is " + withdrawAmount);
				ob.balanceEnquary();
				break;
				
			}
			
			case "2":{
				System.out.println("Enter deposite Amount");
				double amount = sc.nextDouble();
				ob.DepositeAmount(amount);
				ob.balanceEnquary();
				break;
			}
			case "3":{
				//System.out.println("your available balance is : ");
				ob.balanceEnquary();
				break;
			}
			default:
				System.out.println("Please enter correct choice");
			}
			System.out.println("Do you want to perform any other operaction : (YES/NO)" );
			option=sc.next();
			
		} while (option.equalsIgnoreCase("Yes"));
		}
		catch (InvalidAmountException iae) {
			iae.getMessage();
		}
		catch (InsufficientFundException ife) {
			ife.getMessage();
		}
		
		
	}

}

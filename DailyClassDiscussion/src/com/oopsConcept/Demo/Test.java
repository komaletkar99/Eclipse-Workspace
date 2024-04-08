package com.oopsConcept.Demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter deposite amount");
		double dempositeAmount = sc.nextDouble(); 
		
		System.out.println("enter withdraw amount");
		double withdrawAmount = sc.nextDouble(); 
		
		
		AbstractDemo2 ob = new AbstractDemo2();
		System.out.println(ob.deposite(dempositeAmount));
		System.out.println(ob.withdrawAmount(withdrawAmount));
		ob.balanceEnquairy();
		ob.balanceEnquairy(25000);

	}

}

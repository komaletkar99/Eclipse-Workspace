package com.interfaceDemo;

public class Test {

	public static void main(String[] args) {
	abstractDemo k = new kotak();
	k.deposite(5000);
	System.out.println("withdraw amount is : " + k.withdraw(1000));
	k.balanceEnquary();

	}

}

package com.program;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0) {
			int last=n%10;
			sum = (int) (sum+Math.pow(last, 3));
			n=n/10;
		}
		if(num==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}

	}

}

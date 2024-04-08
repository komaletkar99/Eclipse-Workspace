package Assignments;

import java.util.Scanner;

public class CountDigitsFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			int last = n % 10;
			count = count + 1;
			n=n/10;
		}
		System.out.println("Number Of Digits : " + count);

	}

}

package Assignments;

import java.util.Scanner;

public class CountEvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		while(n != 0) {
			int last = n%10;
			if(last % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			n = n / 10;
		}
		System.out.println("Even Digits : " + even);
		System.out.println("Odd Digits : " + odd);
		

	}

}

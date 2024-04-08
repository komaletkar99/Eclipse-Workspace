package Assignments;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		int num=n;
		while(n!=0) {
			int last = n%10;
			rev=rev*10+last;
			n=n/10;
		}
		if(num==rev) {
			System.out.println("The number is Palindrom");
		}
		else {
			System.out.println("The number is not Palindrom");
		}
	}

}

package Assignments;

import java.util.Scanner;

public class MinimumNumUsingNestesForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers : ");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b) {
			if(a<c) {
				System.out.println("The minimun number is " + a);
			}
			else {
				System.out.println("The minimun number is " + c);
			}
		}
		
		if(b<a) {
			if(b<c) {
				System.out.println("The minimun number is " + b);
			}
			else {
				System.out.println("The minimun number is " + c);
			}
		}
		
		

	}

}

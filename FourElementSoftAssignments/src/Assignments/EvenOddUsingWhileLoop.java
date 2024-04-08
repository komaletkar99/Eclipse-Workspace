package Assignments;

import java.util.Scanner;

public class EvenOddUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		int i=1;
        System.out.println("Even numbers are :");
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
				
			}
			i++;
			
		
		}
		 System.out.println("odd numbers are :");
		 i=1;
		while(i<=n) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			i++;
		}


	}

}

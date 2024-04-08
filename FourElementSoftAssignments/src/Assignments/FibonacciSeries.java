package Assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a + " " + b + " " );
		for(int i=2;i<n;i++) {
			c = a + b;
			a=b;
			b=c;
			System.out.print(c + " ");
		}
		

	}

}

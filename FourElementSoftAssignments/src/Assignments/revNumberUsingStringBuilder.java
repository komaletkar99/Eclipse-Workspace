package Assignments;

import java.util.Scanner;

public class revNumberUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int rev=0;
		
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		sb.reverse();
		System.out.println(sb);

	}

}

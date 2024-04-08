package Assignments;

import java.util.Scanner;

public class reverseNumberUsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		sb.reverse();
		System.out.println(sb);

	}

}

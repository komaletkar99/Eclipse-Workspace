package com.array.assignments;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size : ");
	int n = sc.nextInt();
	System.out.println("Enter element in Array : ");
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		sum += arr[i];
	}
	System.out.println("Total array sum is : " + sum);
	}

}

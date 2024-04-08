package com.array.assignments;

import java.util.Scanner;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter element in Array : ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = 0;
		int sum1 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i];
		}
		int sum2 = 0;
		for (int i = 0; i <= 5; i++) {
			sum2 += i;
		}
		res = sum2 - sum1;

		System.out.println("Missing number is : " + res);
	}

}

package com.array.assignments;

import java.util.Scanner;

public class PrintEvenOddFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter element in Array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("Enen numbers : ");
		for(int i= 0;i<n;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd numbers : ");
		for(int i= 0;i<n;i++) {
			if(arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}

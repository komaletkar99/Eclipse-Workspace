package com.fourelementsofttechDailyPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestTwoNumbers {
//	3. Find Largest Two Numbers in Array in Java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		System.out.println("Enter element in array");
		int arr[] = new int[size];
		int firstmax=0;
		int secondLast=0;
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		
	}
		 Arrays.sort(arr);
		for(int i=0;i<size;i++) {
		firstmax  = arr[size-1];
		secondLast = arr[size-2];
	}
		System.out.println("First largest number is : " + firstmax);
		System.out.println("First largest number is : " + secondLast);
	}
}


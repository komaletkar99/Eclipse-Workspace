package com.fourelementsofttechDailyPractice;

import java.util.Scanner;

public class LargestElement {
//	2. Largest Element in Array in Java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		System.out.println("Enter element in array");
		int arr[] = new int[size];
		int max=0;
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		
	}
		max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
	      System.out.println("Maximum elemnet are : " + max);
	}

}

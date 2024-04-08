package com.array.assignments;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = sc.nextInt();
		System.out.println("Enter element in Array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Original Array Before Sorting: ");
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array Arter Sorting: ");
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}


	}

}

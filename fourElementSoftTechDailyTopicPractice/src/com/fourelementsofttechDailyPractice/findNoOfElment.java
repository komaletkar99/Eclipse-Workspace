package com.fourelementsofttechDailyPractice;

import java.util.Scanner;

public class findNoOfElment {

//	1. Find Number of Elements in an Array in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		System.out.println("Enter element in array");
		int arr[] = new int[size];
		int count=0;
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		
	}
		
		for(int i=0;i<size;i++) {
			count += 1;
		}
	      System.out.println("Total number of element are : " + count);
	}

}
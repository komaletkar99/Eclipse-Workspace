package com.array.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {

	public static void main(String[] args) {
		// first approach
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter array size of Array 1: ");
			int n1 = sc.nextInt();
			System.out.println("Enter element in Array1 : ");
			int[] arr1 = new int[n1];
			for (int i = 0; i < n1; i++) {
				arr1[i] = sc.nextInt();
			}
			System.out.println("Enter array size of Array 2: ");
			int n2 = sc.nextInt();
			System.out.println("Enter element in Array1 : ");
			int[] arr2 = new int[n2];
			for (int i = 0; i < n2; i++) {
				arr2[i] = sc.nextInt();
			}
//			
//			boolean status = true;
//			if(arr1.length == arr2.length) {
//				for(int i=0;i<n1;i++) {
//						if(arr1[i] != arr2[i]) {
//							status = false;
//					}
//				}
//			}
//			else {
//				status = false;
//			}
//			
//			
//			if(status == true) {
//				System.out.println("Arrays are equal.");
//			}
//			else {
//				System.out.println("Arrays are not equal.");
//			}
//			
//			Second Approach
			
			boolean result = Arrays.equals(arr1, arr2);
			if(result == true) {
					System.out.println("Arrays are equal.");
				}
				else {
					System.out.println("Arrays are not equal.");
				}

	}

}

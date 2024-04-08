package com.array.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = sc.nextInt();
		System.out.println("Enter element in Array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter target element : ");
		int target = sc.nextInt();
		
		int low = 0;
		int high = arr.length-1;
		
		int mid=0;
		Arrays.sort(arr);
		while(low <= high) {
			 mid=(low+high)/2;
			if(arr[mid] == target) {
				System.out.println(mid);
				break;
			}
			if(arr[mid] < target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		if(low > high) {
			System.out.println("Element Not Found .");
		}

	}

}

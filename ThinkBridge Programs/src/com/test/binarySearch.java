package com.test;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = {7,5,4,6,9,8,2,1};
		int n=arr.length;
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		int target=70;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		while(low<=high) {
			mid=(low+high)/2;
			
			if(arr[mid]==target) {
				System.out.println(mid);
				break;
				
			}
			
			else if(arr[mid]<=target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(low>=high) {
			System.out.println("element not found..");
		}

	}

}

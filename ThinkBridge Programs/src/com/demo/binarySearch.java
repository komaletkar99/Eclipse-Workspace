package com.demo;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = {4,5,9,7,6,2,3,1};//12345679
		int target=4;
		
		Arrays.sort(arr);
	int low=0;
	int high=arr.length-1;
	int mid=0;
	
	while(low<=high) {
		mid = (low+high)/2;
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
		System.out.println("elemet not found ..");
	}

	}

}

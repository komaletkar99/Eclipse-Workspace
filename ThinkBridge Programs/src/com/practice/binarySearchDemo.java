package com.practice;

import java.util.Arrays;

public class binarySearchDemo {

	public static void main(String[] args) {
	int[] arr = {4,6,9,7,2,3,1}; //1234679
	int target=40;
	Arrays.sort(arr);
	
	int low=0;
	int high=arr.length-1;
	
	int mid=0;
	while(low<=high) {
		mid=(low+high)/2;
		
		if(arr[mid]==target) {
			System.out.print(mid);
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
		System.out.println("index not fount");
	}

	}

}
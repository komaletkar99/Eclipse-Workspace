package com.practice;

public class leaniarSearch {
	public static void main(String[] args) {
		int[] arr = {4,6,9,7,2,3,1};
		int target=20;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i);
				break;
			}
		}
		
		if(arr.length==-1) {
			System.out.println("element not found in the array");
		}
	}

}

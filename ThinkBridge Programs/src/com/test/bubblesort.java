package com.test;

public class bubblesort {

	public static void main(String[] args) {
		int[] arr = {4,9,7,8,5,6,3,2};
		int n = arr.length;
		int temp=0;

		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>=arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

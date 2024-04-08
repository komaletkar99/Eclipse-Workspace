package com.array.assignments;

public class findMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		int n = arr.length;
		int sum1=0;
		int sum2=0;
		int res=0;
		for(int i=0;i<n;i++) {
			sum1 += arr[i];
		}
		for(int i=1;i<=6;i++) {
			sum2 += i;
		}
		res = sum2-sum1;
		System.out.println(res);

	}

}

package com.array.assignments;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingUsingInbuildMethods {

	public static void main(String[] args) {
		
		// First Approach
//		int[] arr = {4,5,2,6,3,9,7,1};
//		int n = arr.length;
//		System.out.println("Before sorting array : " + Arrays.toString(arr));
//		Arrays.parallelSort(arr);
//		System.out.println("After sorting array : " + Arrays.toString(arr));
		
		
		
		//Second Approach
//		int[] arr = {4,5,2,6,3,9,7,1};
//		int n = arr.length;
//		System.out.println("Before sorting array : " + Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("After sorting array : " + Arrays.toString(arr));
		

		
		
		// Reverse Decending order
		Integer arr[] = {4,5,2,6,3,9,7,1};
		System.out.println("Before sorting array : " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("After sorting array : " + Arrays.toString(arr));
		
	}

}

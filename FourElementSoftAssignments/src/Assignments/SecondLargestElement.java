package Assignments;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {2,1,5,8,9,6,7,3};
		int n=arr.length;
		int secondLargest = 0;
		int largest=0;
		largest=arr[0];
		secondLargest=arr[0];
		
		 for (int i = 0; i < n; i++) { 
			 if(arr[i]>largest) {
				 secondLargest=largest;
				 largest=arr[i];
			 }
			 else if (arr[i] > secondLargest 
	                && arr[i] < largest) { 
	            	secondLargest = arr[i]; 
	            } 
	        } 
	        System.out.println("second Largest element is: "
	                           + secondLargest); 

	}

}

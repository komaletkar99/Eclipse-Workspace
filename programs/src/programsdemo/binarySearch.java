package programsdemo;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,7,8,9,5,6};
		Arrays.sort(arr);
		int n=arr.length;
		int target=2;
		int low=0;
		int mid=0;
		
		int high=arr.length-1;
		
	
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(arr[mid]==target) {
				System.out.println(mid);
				break;
			}
			if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		if(low>high){
			System.out.println("Element not found !");

		}

	}

}

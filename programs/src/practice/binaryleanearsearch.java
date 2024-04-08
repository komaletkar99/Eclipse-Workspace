package practice;

import java.util.Arrays;

public class binaryleanearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// binary search
		

//		Arrays.sort(arr);
//		int low=0;
//		int high=arr.length-1;
//		int mid=0;
//		while(low<=high) {
//			mid=(low+high)/2;
//			if(arr[mid]==target) {
//				System.out.println(mid);
//				break;
//			}
//			if(arr[mid]<target) {
//				low=mid+1;
//			}
//			else {
//				high=mid-1;
//			}
//		}
//		if(low>high) {
//			System.out.println("element not found !");
//		}
//
//		
		
		// leanear search
		
		int[] arr = {2,3,54,6,8,9,1};
		int target=80;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i);
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("element not found !");
		}
		
	}

}

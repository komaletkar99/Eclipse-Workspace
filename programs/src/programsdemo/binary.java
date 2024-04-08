package programsdemo;

import java.util.Arrays;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,8,9,6,7,3};
		//3,4,6,7,8,9
		Arrays.sort(arr);
		int target = 1;
		
		int low=0;
		int high = arr.length-1;
		int mid=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println(mid);
				break;
			}
			
			if(arr[mid]<=target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	
		if(low>high) {
			System.out.println("Element not found !! ");
		}
	}

}

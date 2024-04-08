package practice;

import java.util.Arrays;

public class thirdlargestnumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,9,7,6,1,5};
//        1 2 4 5 6 7 9 		
		int n=arr.length;
		Arrays.sort(arr);
		System.out.println(arr[n-2]);

	}

}

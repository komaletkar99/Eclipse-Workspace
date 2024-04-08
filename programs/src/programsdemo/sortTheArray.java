package programsdemo;

import java.util.Arrays;

public class sortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,1,0,1,1,0,0,0,1,0,1,0,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}

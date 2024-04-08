package programsdemo;

import java.util.Arrays;

public class thirdLargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,2,8,9,7,3};
		int n = arr.length;
//		int temp=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			}
//		System.out.println(arr[n-2]);
//		

		Arrays.sort(arr);
		System.out.println(arr[n-4]);
	}

}

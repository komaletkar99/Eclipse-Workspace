package programsdemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated, method stub
		int[] arr = {5,6,6,7,8,8,9,10,11,11};
		Arrays.sort(arr);
		Set<Integer> st = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			st.add(arr[i]);
			
		}
		
			System.out.print(st);

		
	}

}

package javaAllPractice;

import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> st = new ArrayList<>();
		st.add(01);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		st.add(6);
		st.add(4);
		st.add(2);
		st.add(3);
		int sum = 0;
		
		for(int num : st) {
			sum+=num;
			System.out.print(num + " ");
			//System.out.print(sum);
		}
		System.out.println();
		System.out.println(sum);

	}

}
package com.string;

public class FindFirstAndLast {

	public static void main(String[] args) {
		int n =99854865;
		int first =0;
		int last=n%10;
		//System.out.println(last);
		while(n!=0) {
			first = n%10;
			n = n/10;
		}

		System.out.println(first);
		System.out.println(last);

	}

}

package com.string;

public class EvenOddCount {

	public static void main(String[] args) {
		int n =5634154;
		int odd=0;
		int even=0;
		//int first=n/10;
		//int count=0;
		while(n!=0) {
			int last=n%10;
			if(last%2==0) {
				even++;
			}
			else {
				odd++;
			}
			n=n/10;
		}
		System.out.println("even = " +  even + "\n" + "odd=" + odd);
	}

}

package com.java.basic.program;

public class specialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 146;
		int num=n;
		int res=0;
		while(n!=0) {
			int last = n%10;
			int fact=1;
			
			for(int i=1;i<=last;i++) {
				fact=fact*i;
			}

			res += fact;
			n=n/10;
		}
		if(num==res) {
			System.out.println("Special number");
		}
		else {
			System.out.println("not special number");
		}

	}

}

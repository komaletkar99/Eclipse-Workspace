package com.praticeDemo;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num=1;
		for(int i=1;i<=n;i++) {
			int temp=num;
			
			for(int j=1;j<=i;j++) {
				System.out.print(temp + " ");
				temp += (n-j);
			}
			num++;
			System.out.println();
		}

	}

}

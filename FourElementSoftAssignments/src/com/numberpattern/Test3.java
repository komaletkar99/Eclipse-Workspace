package com.numberpattern;

public class Test3 {

		public static void main(String[] args) {
			int n = 5;
			for(int i=1;i<=n;i++) {
				for(int j=2*(n-i);j>=1;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}

		}


}

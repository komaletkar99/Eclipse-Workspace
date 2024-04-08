package com.java.basic.program;

public class perfectSquareOrNot {
	public static boolean isPerfectNumber(double n){
		for(int i=1;i*i<=n;i++) {
			if(n%i==0 && n/i==i) {
				return true;
		}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 49;
		if (isPerfectNumber(n)) {
			System.out.println("Perfect number");
		} else {

			System.out.println("not Perfect number");

		}

	}
}

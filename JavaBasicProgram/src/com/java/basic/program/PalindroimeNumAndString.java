package com.java.basic.program;

public class PalindroimeNumAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 12321;
//		int num=n;
//		int rev=0;
//		while(n!=0) {
//			int last = n%10;
//			rev=rev*10+last;
//			n=n/10;
//		}
//		if(num==rev) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}

		String s = "nitindff";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");

		}
	}

}

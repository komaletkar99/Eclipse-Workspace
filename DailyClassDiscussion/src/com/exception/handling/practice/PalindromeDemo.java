package com.exception.handling.practice;

public class PalindromeDemo {

	public static void main(String[] args) {
//		String s = "nitin";
//		String s1="nitin";
//		System.out.println(s==s1);
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev += s.charAt(i);
//		}
//		System.out.println(rev);
//		
//		if(s.equals(rev)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
		
		int n = 121;
		int num = n;
		int rev=10;
		while(n>0) {
			int last = n%10;//12
			rev=rev*10+last;//12
			n=n/10;
			
		}
		if(num==rev) {
			System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}

	}
	
}

package com.sring.assignments.methods;

public class StringMethods {

	public static void main(String[] args) {
		String s = " fourElementsoftech";
		int res=s.charAt(3);
		System.out.println("Result of charAt method : " + res);
		
		int length=s.length();
		System.out.println("Result of length method : " + length);
		
		String uppercase = s.toUpperCase();
		System.out.println("Result of uppercase  method : " + uppercase);
		
		String lowercase = s.toLowerCase();
		System.out.println("Result of uppercase  method : " + lowercase);
		
		String trim = s.trim();
		System.out.println("Result of trim  method : " + trim);
		
		String substring1 = s.substring(3);
		System.out.println("Result of substring  method : " + substring1);
		
		String substring2 = s.substring(3,6);
		System.out.println("Result of substring  method : " + substring2);
		
		String s1 = s.concat(substring2);
		System.out.println("Result of concat method :" + s1);
		
		String s2 = s.indent(4);
		System.out.println("Result of indent method : " + s2);
		String strip = s.strip();
		System.out.println("Result of strip method : " + strip);
		
		
		int digit=0;
		int character=0;
		String str = "a1b2c3d4e5f6hjk";
		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
			digit++;
			}
			if(
			Character.isLetter(str.charAt(i))) {
			character++;
			}
		}
		
		System.out.println("number of character is : " + character);
		System.out.println("number of digit is : " + digit);
		
		String str1 = str.replace('h', 'I');
		System.out.println("Result of replace method is : " + str1);
		
		boolean str2 = str.equals(str1);
		System.out.println("Result of equals method is : " + str2);
		
		
		String str3 = str.replaceAll("a1b", "xyz");
		System.out.println("Result of replaceAll method is : " + str3);
		
		String str4 = str.toString();
		System.out.println("Result of tostring method is : " + str4);
		
		String str5 = str.repeat(4);
		System.out.println("Result of repeat method is : " + str5);
	}

}

package com.demo;

public class firstlettercapital {

	public static void main(String[] args) {
		String s = "India is my country";
		String[] str = s.split("\\s");
		 s = s.trim();
		String first,remainimg,capital;
		for(String s1 : str) {
			first = s1.substring(0,1);
			first=first.toUpperCase();
			remainimg = s1.substring(1);
			capital = first + remainimg;
			
			System.out.print(capital + " ");
		}

	}

}
package com.demo;

public class countWord {

	public static void main(String[] args) {
		String s = "India is my country";
		int count = s.split("\\s").length;
		System.out.println(count);

	}

}

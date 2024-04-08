package com.sring.assignments.methods;

import java.util.Scanner;

public class removeBlanckSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String res = s.replaceAll("\\s", "");
		System.out.println(res);
	}

}

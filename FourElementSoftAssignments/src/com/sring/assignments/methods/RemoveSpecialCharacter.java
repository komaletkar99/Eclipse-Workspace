package com.sring.assignments.methods;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		String res = s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(res);

	}

}

package com.string.practice.demo;

import java.util.Random;
import java.util.UUID;

public class randString {
public static void main(String[] args) {
	Random rand = new Random();
	int ans = rand.nextInt(10);
	System.out.println(ans);
	String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0);
	System.out.println(random);
}
}

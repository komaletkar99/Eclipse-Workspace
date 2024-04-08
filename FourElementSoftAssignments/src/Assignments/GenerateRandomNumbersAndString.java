package Assignments;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		Random rand = new Random();
		int random = rand.nextInt(10);
		System.out.println("Rnadom number : " + random);
		
		String stringRandom = UUID.randomUUID().toString().replaceAll("-", "").substring(0);
		System.out.println("Random String : " + stringRandom);

	}

}

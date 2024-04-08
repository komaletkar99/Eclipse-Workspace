package com.sring.assignments.methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		//first approach
//		FileReader fr = new FileReader("E:\\fourElementSoftechAssignments\\CountWord.java");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String str;
//		while((str=br.readLine()) != null) {
//			System.out.println(str);
//		}
//		br.close();
		
		// approach 2 : using file and scanner
		
		File file = new File("E:\\fourElementSoftechAssignments\\CountWord.java");
		Scanner sc = new Scanner(file);
		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		//approach 3
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
	}

}

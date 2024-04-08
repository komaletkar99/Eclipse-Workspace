package Assignments;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws Exception {
		FileWriter fr = new FileWriter("E:\\fourElementSoftechAssignments\\CountWord.java"); 
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Selenium with java");
		br.write("Selenium with python");
		br.write("Selenium with C#");
		
		System.out.println("Fineshed !");
		br.close();
		

	}

}

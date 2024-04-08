package com.serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		dog a = new dog();
		//first case 
//		System.out.println(a.i + " " + a.j);
//		FileOutputStream fos = new FileOutputStream("java.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(a);
//		
//		FileInputStream fis = new FileInputStream("java.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		dog a1 = (dog)ois.readObject();
//		System.out.println(a1.i + " " + a1.j);
		
		// second case
		dog a = new dog();
		a.i=800;
		a.j=999;
		System.out.println(a.i + " " + a.j);
		FileOutputStream fos = new FileOutputStream("java.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("java.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		dog a1 = (dog)ois.readObject();
		System.out.println(a1.i + " " + a1.j);

	}

}

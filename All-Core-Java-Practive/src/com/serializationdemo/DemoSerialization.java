package com.serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		employee e = new employee();
		
		//below part of the serialization
		System.out.println(e.name + " " + e.city + " " + e.j + " " + e.id);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		// below part of the deserilization
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		employee e1 = (employee)ois.readObject();
		System.out.println(e1.name + " " + e1.city + " " + e1.j + " " + e1.id);
		

	}

}

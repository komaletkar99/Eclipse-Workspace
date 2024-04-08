package com.searilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class customizedSerilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		employee e = new employee();
		System.out.println(e.id + " " + e.name);
		System.out.println("serialization started");
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		System.out.println("deserilization started");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		employee e1 = (employee)ois.readObject();
		System.out.println(e1.id + " " + e1.name);

	}

}

package com.searization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class employee implements Serializable{
	String name = "komal";
	String city = "pune";
	int i = 10;
	int j = 20;

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		employee e = new employee();
		System.out.println("serialization started");
		System.out.println(e.name + " " + e.city + " " + e.i + " " + e.j);
		FileOutputStream fos = new FileOutputStream("java.java");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("serialization ended");
		
		System.out.println("DEserialization started");
		FileInputStream fis = new FileInputStream("java.java");
		ObjectInputStream ois = new ObjectInputStream(fis);
		employee e1 = (employee)ois.readObject();
		System.out.println(e1.name + " " + e1.city + " " + e1.i + " " + e1.j);
		System.out.println("DEserialization ended");
		
	}
}
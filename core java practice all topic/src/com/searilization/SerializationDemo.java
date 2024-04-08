package com.searilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{
	String name="komal";
	transient String pass = "Komal@123";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("serialization started");
		SerializationDemo obj = new SerializationDemo();
		System.out.println("name " + obj.name + " " + "Pass " + obj.pass);
       FileOutputStream fis = new FileOutputStream("java.txt");
	   ObjectOutputStream oos = new ObjectOutputStream(fis);
	   oos.writeObject(obj);
	
	   System.out.println("deserilization started");
	   FileInputStream is = new FileInputStream("java.txt");
	   ObjectInputStream ois = new ObjectInputStream(is);
	   SerializationDemo obj1 =(SerializationDemo)ois.readObject();
	   System.out.println("name " + obj1.name + " " + "Pass " + obj1.pass);
	   
	   
	
	
	}
}

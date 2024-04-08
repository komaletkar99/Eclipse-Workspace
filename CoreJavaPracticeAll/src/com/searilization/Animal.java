package com.searilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dog {
	int j=80;
	dog(){
		System.out.println("dog cunstructor called");
	}
}
class cat extends dog implements Serializable{
	int i=30;
	cat(){
		System.out.println("cat cunstructoe called");
	}
}
public class Animal {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		cat d = new cat();
		d.i=888;
		d.j=999;
		System.out.println("serilization started");
		System.out.println(d.j + " " +  d.i);
		
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		System.out.println("deserilization started");
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		cat c1 =(cat)ois.readObject();
		System.out.println(c1.j + " " +  c1.i);

	}
}

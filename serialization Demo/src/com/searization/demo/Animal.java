package com.searization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dog{
	int i=10;
	dog(){
		System.out.println("Dog constructor called");
	}
}
class cat extends dog implements Serializable{
	int j=20;
	cat(){
		System.out.println("Cat constructor called");
	}
}

public class Animal {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	cat c = new cat() ;
	c.i=888;
	c.j=999;
	
	System.out.println(c.i + " " + c.j);
	FileOutputStream fos = new FileOutputStream("java.txtt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(c);
	
	FileInputStream fis = new FileInputStream("java.txtt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	cat c1 = (cat)ois.readObject();
	System.out.println(c1.i + " " + c1.j);
	}

}

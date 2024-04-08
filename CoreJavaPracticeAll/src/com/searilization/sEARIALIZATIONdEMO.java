package com.searilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class sEARIALIZATIONdEMO {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		demo e = new demo();
		System.out.println(e.i + " " + e.j);
		System.out.println("serialization started");
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		System.out.println("deserilization started");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		demo e1 = (demo)ois.readObject();
		System.out.println(e1.i + " " + e1.j);
		
	
		

	}

}

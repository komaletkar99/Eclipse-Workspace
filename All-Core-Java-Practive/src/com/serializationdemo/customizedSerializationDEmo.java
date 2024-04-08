package com.serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class customizedSerializationDEmo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a = new Account();
		System.out.println(a.username + " " + a.pass);
		FileOutputStream fos = new FileOutputStream("xyz.sers");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("xyz.sers");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a1 = (Account)ois.readObject();
		System.out.println(a1.username + " " + a1.pass);

	}

}

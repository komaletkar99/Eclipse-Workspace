package com.searization.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable{
	String username="java";
	transient String pass = "java@123";
	
	private void writeObject(ObjectOutputStream os) throws IOException {
		os.defaultWriteObject();
		String pswd = "123" + pass;
		os.writeObject(pswd);
		
	}
private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		String pswd = (String) is.readObject();
		pass = pswd.substring(3);
	}
	
}

public class customizedSerilalizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		test e = new test();
	System.out.println(e.username + " " + e.pass );
	FileOutputStream fos = new FileOutputStream("java.java");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(e);
	
	FileInputStream fis = new FileInputStream("java.java");
	ObjectInputStream ois = new ObjectInputStream(fis);
	test e1 = (test)ois.readObject();
	System.out.println(e1.username + " " + e1.pass);
	
	}
}

package com.serializationdemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{

	String username="java";
	transient String pass = "java@123";

	private void writeObject(ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();
		String pswd = "123" + pass;
		os.writeObject(pswd);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		String pswd = (String)is.readObject();
		pass=pswd.substring(3);
	}

}

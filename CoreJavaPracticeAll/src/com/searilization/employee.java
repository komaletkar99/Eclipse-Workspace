package com.searilization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class employee implements Serializable{
int id = 1001;
transient String name = "java@123";


private void writeObject(ObjectOutputStream os) throws IOException {
	os.defaultWriteObject();
	String pass = 123 + name;
	os.writeObject(pass);
	
	
}

private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
	is.defaultReadObject();
	String pass = (String)is.readObject();
	name = pass.substring(3);
}
}

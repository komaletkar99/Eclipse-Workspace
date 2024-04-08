package com.sring.assignments.methods;

import java.util.Objects;

class demo{
	int id;
	String name;
	public demo(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	
	
	
	
	 @Override
	public int hashCode() {
		return Objects.hash(id, name);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		demo other = (demo) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	 @Override protected void finalize()
	    {
	        System.out.println("finalize method called");
	    }



	public String toString() {
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }




}
public class ObjectClassMethods {
	
	public static void main(String[] args){
		demo d = new demo(1001,"Veera");
		System.out.println("Result of tostring method : " + d.toString());
		System.out.println("Result of equals method : " + d.equals(d));	
		System.out.println("Result of hashcode method : " + d.hashCode());
		d.finalize();
		
		
		Object ob = new String("fourelementsoftech");
		Class c = ob.getClass();
		System.out.println("class of object ob is : " + c.getName());
		
		

	}

}

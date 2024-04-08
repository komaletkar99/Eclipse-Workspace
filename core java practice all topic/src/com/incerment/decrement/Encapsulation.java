package com.incerment.decrement;

public class Encapsulation {

	private int id;
	private String name;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		
		
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
	Encapsulation ob = new Encapsulation();
	ob.setId(1001);
	ob.setName("Komal");
	
	System.out.println("Id" + ob.getId());
	System.out.println("Name:" + ob.getName());

	}

}

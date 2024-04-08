package com.hasARelationship;

class parent {

	int id;
	String name;

	
	public parent(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public String show() {
		return " name:" + name + " id:" + id;
	}
}

class child{
	String state;
	String city;
	parent p;
	
	public child(String state, String city, parent p) {
		this.state=state;
		this.city=city;
		this.p = p;
	}
	
	public String toString() {
		return p.show() +" " + " state:" + state + " city:" + city;
	}
}
public class HasARelationshipDemo {

	public static void main(String[] args) {
		parent p = new parent(1001, "komal");
		child c = new child("Sambhajinagar","MH",p);
		System.out.println(c.toString());

	}

}

package com.all.java.practice;
class parent{
	int id;
	String name;
	String city;
	String state;
	public parent(int id, String name, String city, String state) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "id= "  + id + ", name=" + name + ", city=" + city + ", state=" + state + " ";
	}
	
	
	
}


class child{
	parent ob;
	String country;
	double salary;
	public child(String country, double salary, parent ob) {
		super();
		this.ob = ob;
		this.country = country;
		this.salary = salary;
	}
	@Override
	
	public String toString() {
		return  "country=" + country + ", salary=" + salary + " " + ob;
	}
	
	
	
}
public class HasArelationShipDemo {

	public static void main(String[] args) {
		parent p = new parent(1001,"komal","pune","MH");
		child c = new child("india",4545.56,p);
		
		System.out.println(c.toString());

	}

}

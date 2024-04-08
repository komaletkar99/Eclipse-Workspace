package com.has.a.relationship;

class Demo {
	String name;
	int id;
	String city;
	String state;

	public Demo() {
		
	}
	public Demo(String name, int id, String city, String state) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		

	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", city=" + city + ", state=" + state;
	}
	
	
}

class Employee {
	String empName;
	String empCity;
	Demo d;
	public Employee(String empName, String empCity, Demo d) {
		this.empName = empName;
		this.empCity = empCity;
		this.d = d;
	}
	@Override
	public String toString() {
		return "empName=" + empName + ", empCity=" + empCity  + d;
	}

	
	
}

public class HasARelationshipDemo {
	public static void main(String[] args) {
		Demo d = new Demo("komal",1001,"pune","MH");
		Employee e = new Employee("Raosaheb", "Mumbai", d);
		System.out.println(e);
	}
	

}

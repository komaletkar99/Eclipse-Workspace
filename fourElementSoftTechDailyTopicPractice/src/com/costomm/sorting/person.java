package com.costomm.sorting;
class person implements Comparable<person>{

	private String name;
	private int age;
	
	public person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return this.name;
		
	}
	
	public int getAge() {
		return this.age;
	}
	
	public 	String toString() {
		return "Name : " + name + " " +  "Age : " + age;
	}
	
	@Override
	public int compareTo(person o) {
		return Integer.compare(this.age, o.age);
	}
	
	
}

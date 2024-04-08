package com.HasARElationshipPractice;
class test1{
	int id;
	String name;
	public test1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}
	
	
}

class test22{
	String city;
	String state;
	test1 ob;
	public test22(String city, String state, test1 ob) {
		super();
		this.city = city;
		this.state = state;
		this.ob = ob;
	}
	@Override
	public String toString() {
		return  ob + "city=" + city + ", state=" + state + " ";
	}
	
	
	
}
public class demo {

	public static void main(String[] args) {
		test1 ob = new test1(1001,"komal");
		test22 ob1 = new test22("pune","MH",ob);
		System.out.println(ob1);

	}

}

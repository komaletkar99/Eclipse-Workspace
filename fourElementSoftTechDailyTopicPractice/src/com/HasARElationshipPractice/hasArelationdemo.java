package com.HasARElationshipPractice;
class A{
	int id;
	String name;
	String city;
	String state;
	public A(int id, String name, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", city=" + city + ", state=" + state;
	}

	
	
}

class B{
	int empid;
	String empname;
	A a;
	
	
	public B(int empid, String empname, A a) {
		this.empid = empid;
		this.empname = empname;
		this.a = a;
	}


//	public String show() {
//		return "empid=" + empid + ", empname=" + empname + ", a=" + a + a.display() ;
//	}

	@Override
	public String toString() {
		return "empid=" + empid + ", empname=" + empname + ", a=" + a + a.toString() ;
	}
}

public class hasArelationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(101,"Komal", "pune", "MH");
		B b = new B(1001, "rao",a);
		b.toString();
		System.out.println(b);

	}

}

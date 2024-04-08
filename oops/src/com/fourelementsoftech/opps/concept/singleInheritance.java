package com.fourelementsoftech.opps.concept;

class parent {
	int id = 10;
	String name = "komal";

	public void display() {
		System.out.println("The name is : " + name);
		System.out.println("The id is : " + id);
	}
}
class child extends parent{
	public void display() {
		System.out.println("hiiii");
		System.out.println("The name is : " + name);
		System.out.println("The id is : " + id);
	}
}

public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.display();
		parent p = new parent();
		p.display();

	}

}

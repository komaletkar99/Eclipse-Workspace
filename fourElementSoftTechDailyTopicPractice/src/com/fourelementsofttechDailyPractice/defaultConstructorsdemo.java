package com.fourelementsofttechDailyPractice;

public class defaultConstructorsdemo {
	int id;
	String name;
	int rollno;
	String address;
	
	public defaultConstructorsdemo() {
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		this.address=address;
	}
	
	

	@Override
	public String toString() {
		return "defaultConstructorsdemo [id=" + id + ", name=" + name + ", rollno=" + rollno + ", address=" + address
				+ "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		defaultConstructorsdemo obj = new defaultConstructorsdemo();
		obj.id=10;
		obj.name="komal";
		obj.rollno=32;
		obj.address="Chatrapati Sambhajinagar";
		
		System.out.println(obj);

	}

}

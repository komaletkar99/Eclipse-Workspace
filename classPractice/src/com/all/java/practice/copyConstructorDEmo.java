package com.all.java.practice;

public class copyConstructorDEmo {
	String name;
	String city;
	
	public copyConstructorDEmo(String name, String city) {
		this.name=name;
		this.city=city;
	}

	public copyConstructorDEmo(copyConstructorDEmo ob) {
		name=ob.name;
		city=ob.city;
	}
	

	@Override
	public String toString() {
		return "name=" + name + ", city=" + city ;
	}


	public static void main(String[] args) {
		copyConstructorDEmo obj = new copyConstructorDEmo("komal","pune");
		System.out.println(obj);
		copyConstructorDEmo obj1 = new copyConstructorDEmo(obj);
		System.out.println(obj1);

	}

}

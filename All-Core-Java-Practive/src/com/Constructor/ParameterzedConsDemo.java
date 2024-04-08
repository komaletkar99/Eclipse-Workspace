package com.Constructor;

public class ParameterzedConsDemo {
	int id;
	String name;
	
	
	public ParameterzedConsDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	public static void main(String[] args) {
		ParameterzedConsDemo p = new ParameterzedConsDemo(10, "komal");
		System.out.println(p);

	}

}

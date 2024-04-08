package com.Constructor;

public class CopyConStructorDemo {
	String name;
	String city;
	
	public CopyConStructorDemo(String name, String city) {
		this.name=name;
		this.city=city;
	}

	public CopyConStructorDemo(CopyConStructorDemo ref) {
		name=ref.name;
		city=ref.city;
	}
	
	
	@Override
	public String toString() {
		return "CopyConStructorDemo [name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		CopyConStructorDemo c = new CopyConStructorDemo("pooja", "Pune");
		CopyConStructorDemo c1 = new CopyConStructorDemo(c);
		System.out.println(c);

	}

}

package com.sconstructor;

class consdemo {
	int id;
	String name;
	String state;
	String city;
	
	public consdemo() {
		this.id=id;
		this.name=name;
		this.state=state;
		this.city=city;
	}
	public consdemo(int id, String name, String state, String city) {
		this.id=id;
		this.name=name;
		this.state=state;
		this.city=city;
	}

	@Override
	public String toString() {
		return "consdemo [id=" + id + ", name=" + name + ", state=" + state + ", city=" + city + "]";
	}
	
}
	public class Test {
	public static void main(String[] args) {
		consdemo ob = new consdemo();
		ob.id = 1002;
		ob.name = "Rao";
		ob.state = "MH";
		ob.city= "pune";
		consdemo t = new consdemo(1001,"komal","MH","pune");
		System.out.println(t.toString());
		System.out.println(ob.toString());

	}

}

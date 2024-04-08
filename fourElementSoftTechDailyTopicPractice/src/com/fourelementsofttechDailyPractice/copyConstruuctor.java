package com.fourelementsofttechDailyPractice;

public class copyConstruuctor {

	String name;
	int id;
	String city;
	String state;
	
	

public copyConstruuctor(String name, int id, String city, String state) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.state = state;
	}
public copyConstruuctor(copyConstruuctor ref) {
	name=ref.name;
	id=ref.id;
	city=ref.city;
	state =ref.state;
	
	
	
}
	@Override
public String toString() {
	return "name=" + name + ", id=" + id + ", city=" + city + ", state=" + state;
}


	public static void main(String[] args) {
		copyConstruuctor ob = new copyConstruuctor("komal",1001,"pune","MH");
		ob.toString();
		System.out.println(ob);
	
		
		

	}

}

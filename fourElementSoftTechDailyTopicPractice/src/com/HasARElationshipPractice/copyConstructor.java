package com.HasARElationshipPractice;

public class copyConstructor {
	String name;
	int id;
	int rollno;
	String city;
	
	

	public copyConstructor(String name, int id, int rollno, String city) {
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		this.city = city;
	}



	@Override
	public String toString() {
		return "copyConstructor [name=" + name + ", id=" + id + ", rollno=" + rollno + ", city=" + city + "]";
	}


	public copyConstructor(copyConstructor ref) {
		name=ref.name;
		id=ref.id;
		rollno=ref.rollno;
		city=ref.city;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyConstructor obj1 = new copyConstructor("komal", 101, 14, "pune");
		copyConstructor obj2 = new copyConstructor(obj1);
		System.out.println(obj1);
		System.out.println(obj2);

	}

}

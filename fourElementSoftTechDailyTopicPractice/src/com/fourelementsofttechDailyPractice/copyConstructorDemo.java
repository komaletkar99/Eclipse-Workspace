package com.fourelementsofttechDailyPractice;

public class copyConstructorDemo {
	int id;
	int rollno;
	String add;
	String name;

	public copyConstructorDemo() {
		id = 10;
		rollno = 12;
		add = "Sambhajinagar";
		name = "komal";
		
		System.out.println(id + " " + rollno + " " + add + " " + name);

	}

	public copyConstructorDemo(copyConstructorDemo ref) {
	id=ref.id;
	rollno=ref.rollno;
	name=ref.name;
	add=ref.add;
		
	System.out.println(id + " " + rollno + " " + add + " " + name);
	}
	
	
	public static void main(String[] args) {
     copyConstructorDemo obj1 = new copyConstructorDemo();
	 copyConstructorDemo obj2 = new copyConstructorDemo(obj1);
	
	}
}

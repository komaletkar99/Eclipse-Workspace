package com.fourelementsofttechDailyPractice;

public class methodToStringDemo {
	int id;
	String name;
	int rollno;
	double salary;
	
	public void show() {
		this.id=10;
		this.name="komal";
		this.rollno=123;
		this.salary=5654.78;
		
		
	}

	@Override
	public String toString() {
		return "methodToStringDemo [id=" + id + ", name=" + name + ", rollno=" + rollno + ", salary=" + salary + "]";
	}
public static void main(String[] args) {
	methodToStringDemo ob = new methodToStringDemo();
	ob.show();
	System.out.println(ob);
	}

}

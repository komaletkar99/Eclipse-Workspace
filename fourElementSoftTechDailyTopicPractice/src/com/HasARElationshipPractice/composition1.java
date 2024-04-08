package com.HasARElationshipPractice;

public class composition1 {
	int id;
	String name;
	String city;
	String state;
	String country;
	public composition1(int id, String name, String city, String state, String country) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String GetDetail() {
		return "ID : " + id + ", " + "Name : " + name + ", " +  "City : " + city + ", " +  "State : " + state  + ", " + "Country : " + country + " ";
	}

}

class person{
	String EmpId;
	double salary;
	composition1 ob;
	public person(String empId, double salary, composition1 ob) {
		this.EmpId = empId;
		this.salary = salary;
		this.ob=ob;
	}
	public String displayPersonDetail() {
		return "EmpId : "  + EmpId  +", " +  "Salary : " + salary + ", " + ob.GetDetail();
		
	}
	
	
}
class TestCode{
	public static void main(String[] args) {
		composition1 obj1 = new composition1(101, "Ram", "Pune", "MH", "India");
		person p = new person("1001", 4545.45, obj1);
		System.out.println(p.displayPersonDetail());
	}
}

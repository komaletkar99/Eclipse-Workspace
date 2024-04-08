package Assignments;
class swift{
	String EmpName;
	int EmpId;
	String city;
	double EmpSalary;
	static String Address = "Pune Maharashtra India";

	public void display() {
		System.out.println("This is parent class method");
	}
	public static String show() {
		return Address;
	}
}
class nexon extends swift{
	public nexon(String empName, int empId, String city, double empSalary) {
		this.EmpName = empName;
		this.EmpId = empId;
		this.city = city;
		this.EmpSalary = empSalary;
	}

	@Override
	public String toString() {
		return "nexon [EmpName=" + EmpName + ", EmpId=" + EmpId + ", city=" + city + ", EmpSalary=" + EmpSalary + "]";
	}

	public int add(int a, int b) {
		int c = a+b;
		return c;
		
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		nexon obj1 = new nexon("Sham", 101, "Chatrapati Sambhajinagar", 4545.45);
		System.out.println(obj1);
		int res = obj1.add(10, 40);
		System.out.println(res);
		swift obj2 = new swift();
		obj2.display();
		System.out.println(swift.show());

	}

}

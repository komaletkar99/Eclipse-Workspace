//package Assignments;
//
//public class Person {
//	private String FirstName;
//	private String LastName;
//	private String Gender;
//	private String DateOfBirth;
//	private String Occupation;
//	public String getFirstName() {
//		return FirstName;
//	}
//	public void setFirstName(String firstName) {
//		FirstName = firstName;
//	}
//	public String getLastName() {
//		return LastName;
//	}
//	public void setLastName(String lastName) {
//		LastName = lastName;
//	}
//	public String getGender() {
//		return Gender;
//	}
//	public void setGender(String gender) {
//		Gender = gender;
//	}
//	public String getDateOfBirth() {
//		return DateOfBirth;
//	}
//	public void setDateOfBirth(String dateOfBirth) {
//		DateOfBirth = dateOfBirth;
//	}
//	public String getOccupation() {
//		return Occupation;
//	}
//	public void setOccupation(String occupation) {
//		Occupation = occupation;
//	}
//	@Override
//	public String toString() {
//		return "Employee Details : " + "FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender + ", DateOfBirth="
//				+ DateOfBirth + ", Occupation=" + Occupation + " \n " ;
//	}
//
//
//}
//class Employee extends Person{
//	int EmpId;
//	String EmpName;
//	double EmpSalary;
//	String EmpCity;
//	Person ob;
//	public Employee(int empId, String empName, double empSalary, String empCity, Person ob) {
//		this.EmpId = empId;
//		this.EmpName = empName;
//		this.EmpSalary = empSalary;
//		this.EmpCity = empCity;
//		this.ob=ob;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee Details : " + "EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpCity=" + EmpCity + "\n" 
//				 + ob ;
//	}
//
//
//
//
//	public static void main(String[] args) {
//		Person p = new Person();
//		p.setFirstName("Komal");
//		p.setLastName("Shinde");
//		p.setGender("Female");
//		p.setDateOfBirth("12/04,1995");
//		p.setOccupation("Teacher");
//		
//		p.getFirstName();
//		p.getLastName();
//		p.getGender();
//		p.getDateOfBirth();
//		p.getOccupation();
//		p.toString();
//		Employee e = new Employee(1001, "Kirti", 4545.65,"Pune", p);
//		System.out.println(e);
//		}
//
//}
package com.jdbc.crud.demo;

public class Student {
	private int studentId;
	private String studentName;
	private String studentCity;
	private String StudentGender;
	private String studentState;
	private String studentCountry;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentGender() {
		return StudentGender;
	}
	public void setStudentGender(String studentGender) {
		StudentGender = studentGender;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", StudentGender=" + StudentGender + ", studentState=" + studentState + ", studentCountry="
				+ studentCountry + "]";
	}
	
	

}

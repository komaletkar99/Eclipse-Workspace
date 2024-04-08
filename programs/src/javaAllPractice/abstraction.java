package javaAllPractice;

abstract class demo{
	public abstract void show();
	public void display() {
		System.out.println("This is a parent class");
	}
}
 class child extends demo{
	 public void show() {
		 System.out.println("this is a chield class");
	 }
 }

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj = new child();
		obj.display();
		obj.show();
	

	}

}

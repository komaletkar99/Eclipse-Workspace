package javaAllPractice;

class p1{
	public String display(String name) {
		return name;
	}
}
	class c1 extends p1{
	public String display(String name) {
		return name;
	}
	
}
public class overring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj = new c1();
		obj.display("komal");
		obj.display("etkar");
		System.out.println(obj.display("komal"));
		System.out.println(obj.display("etkar"));

	}
 
}
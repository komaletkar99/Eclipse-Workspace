package practice;

abstract class pdemo{
	public abstract void show();
	
	public void display() {
		System.out.println("This is a parent class");
	}
	
}
class cdemo extends pdemo{
	public void show() {
		System.out.println("this is child class");
	}
}
public class abstdemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pdemo obj = new cdemo();
		obj.show();
		obj.display();

	}

}

package classPractice;
class car{
	public void show() {
		System.out.println("car class method");
	}
}
class bike{
	car c;
	public void display() {
		System.out.println("bike class method");
		c=new car();
		c.show();
	}
}

public class associationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b = new bike();
		b.display();
		
		

	}

}

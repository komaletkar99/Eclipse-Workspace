package programsdemo;
class van{
	public void display() {
		System.out.println("This is a parent class");
	}
}
class swift extends van {
	public void display() {
	System.out.println("This is a child class");
}
}
public class demoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		van obj = new van();
		obj.display();
		swift obj1 = new swift();
		obj.display();

	}

}

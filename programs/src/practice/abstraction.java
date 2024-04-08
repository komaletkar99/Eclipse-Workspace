package practice;
abstract class parent{
	public abstract void show();

	public void dispay() {
		System.out.println("Thia is parent class");
	}
	

}
class child extends parent{
	public void show() {
		System.out.println("This is chils class");
	}
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj = new child();
		obj.dispay();
		obj.show();

	}

}

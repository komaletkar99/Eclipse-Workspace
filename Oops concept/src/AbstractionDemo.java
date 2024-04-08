abstract class parent{
	public void show() {
		System.out.println("show method called.");
	}

	public abstract void display();
}
public class AbstractionDemo extends parent{
	@Override
	public void display() {
		System.out.println("display method called..");
		
	}
	
	public static void main(String[] args) {
		AbstractionDemo ob = new AbstractionDemo();
		ob.show();
		ob.display();

	}

}

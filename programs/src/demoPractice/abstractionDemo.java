package demoPractice;
abstract class parent {
public abstract void show();
	
	public void display() {
		System.out.println("This is a parent class method");
		
	}

}
	
	class child extends parent{
		@Override
		public  void show() {
			// TODO Auto-generated method stub
			System.out.println("This is a child class method");
			
		}
	}
	public class abstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ob = new child();
		ob.display();
		ob.show();
		

	}

	}

package classPractice;
class parent{
	public void display() {
		System.out.println("parent class method");
	}
}
class child extends parent{
	public void display() {
		System.out.println("child class method");
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		child c= new child();
//		c.display();
		
		parent p = new child();
		p.display();
		

	}

}

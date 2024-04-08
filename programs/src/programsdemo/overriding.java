package programsdemo;
class parent{
	public static void show() {
		System.out.println("this is a parent");
	}
}
	class clild{
	public static void show() {
		System.out.println("this is a child");
	}
	
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		p.show();
		clild c = new clild();
		
		c.show();

	}

}

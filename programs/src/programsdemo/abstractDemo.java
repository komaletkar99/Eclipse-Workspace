package programsdemo;
abstract class Test{
	abstract void show();
}
class demo extends Test{

	@Override
	public void show() {
		System.out.println("Heloooooo");
		
	}
	
}

public class abstractDemo {
	public static void main(String[] args) {
		demo obj = new demo();
		obj.show();
	}

}

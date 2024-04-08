package Assignments;

class vehical {
	public void show() {
		System.out.println("Method defined insight vehical class");
	}
}
class car extends vehical {
	public void showCar() {
		System.out.println("Method defined insight car class");
	}
}
class cycle extends vehical {
	public void showCycle() {
		System.out.println("Method defined insight cycle class");
	}
}
class bike extends vehical {
	public void showBike() {
		System.out.println("Method defined insight bike class");
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {

		bike ob = new bike();
		ob.show();
		ob.showBike();
		cycle c = new cycle();
		c.showCycle();
		car ob1 = new car();
		ob1.showCar();
	}
}

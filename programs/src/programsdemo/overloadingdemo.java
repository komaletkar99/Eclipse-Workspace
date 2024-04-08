package programsdemo;
class Car{
	public int add(int a, int b) {
		return a+b;
		
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}

public class overloadingdemo {

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(4, 5, 6));

	}

}

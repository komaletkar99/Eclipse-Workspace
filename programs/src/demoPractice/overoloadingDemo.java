package demoPractice;

public class overoloadingDemo {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
public static void main(String[] args) {
	overoloadingDemo obj = new overoloadingDemo();
	System.out.println(obj.add(10, 20));
	System.out.println(obj.add(2,40, 23));
}
}

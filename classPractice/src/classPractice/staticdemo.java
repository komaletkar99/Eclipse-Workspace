package classPractice;
class staticd{
	static int a;
	static String name;
	
	public static int add(int a, int b) {
		int c= a+b;
		return c;
	}
	public static int mul(int a, int b) {
		int c= a*b;
		return c;
	}
public static void show() {
	System.out.println(a);
	System.out.println(name);
}
}

public class staticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staticd.a=10);
		System.out.println(staticd.name="komal");
		System.out.println(staticd.add(4, 56));
		System.out.println(staticd.mul(2, 6));
		staticd.show();

	}

}

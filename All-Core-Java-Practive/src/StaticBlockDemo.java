
public class StaticBlockDemo {
	static{
	 System.out.println("static block1");
	}
	{
		System.out.println("non-static block");
	}
	static{
		System.out.println("static block2");
	}
	{
		System.out.println("non-static block2");
	}
	static {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		StaticBlockDemo b = new StaticBlockDemo();

	}

}

package programsdemo;
class main{
public static int add(int a, int b) {
	int sum = a+b;
	return sum;
}
public static int add(int a, int b, int c) {
	int sum = a+b+c;
	return sum;
}
}
public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main obj = new main();
		int result=obj.add(10, 20);
		int sum=obj.add(4,5,6);
		System.out.println(result + "\n" + sum);

	}

}

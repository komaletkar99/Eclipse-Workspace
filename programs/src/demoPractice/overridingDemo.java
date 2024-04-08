package demoPractice;

class parent11{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}

class childe11 extends parent11{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	

}
public class overridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childe11 ob = new childe11();
		System.out.println(ob.add(2, 7));
		System.out.println(ob.add(2, 4, 4));
	}

}

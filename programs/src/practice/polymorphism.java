package practice;
// method overloading

//class demo{
//	int sum=0;
//	int res=0;
//	public void add(int a, int b) {
//		sum = a+b;
//		System.out.println(sum);
//	}
//	public void add(int a, int b, int c) {
//		res=a+b+c;
//		System.out.println(res);
//	}
//}
//public class polymorphism {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		demo d = new demo();
//		d.add(2,4,6);
//		d.add(3,5);
//		
//
//	}
//
//}

class parent1{
	public void add (int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	
}
class child1 extends parent1{
	public void add (int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
}

public class polymorphism {
	public static void main(String[] args) {
		parent1 obj = new child1() ;
		obj.add(2, 4);
		obj.add(4, 6);
}

}

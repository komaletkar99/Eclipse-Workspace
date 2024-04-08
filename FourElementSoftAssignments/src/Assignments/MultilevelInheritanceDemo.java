package Assignments;
class A{
	public void show1() {
		System.out.println("A class method ");
	}
}
	class B extends A{
		public void show2() {
			System.out.println("B class method ");
		}
}
	
	class C extends B{
		public void show3() {
			System.out.println("C class method ");
		}
	}
	class D extends C{
		public void show4() {
			System.out.println("D class method ");
		}
	}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		D obj1 = new D();
		obj1.show1();
		obj1.show2();
		obj1.show3();
		obj1.show4();

	}

}

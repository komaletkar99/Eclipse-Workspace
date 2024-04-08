package programsdemo;

//abstraction

//abstract class abc{
//	public abstract void show();
//}
//
//class demo1 extends abc{
//	public void show() {
//		System.out.println("this is a method");
//	}
//}


// encapsulation

class parent1{
	int id;
	String name;
	
	public int getId() {
		return this.id;
	}
	public int setId(int id) {
		return this.id=id;
	}
	public String getName() {
		return this.name;
	}
	public String setName(String name) {
		return this.name=name;
	}
}
public class practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      demo1 obj = new demo1();
//      obj.show();
      
//      abc obj = new demo1();
//      obj.show();
		
		parent1 obj = new parent1() ;
		obj.setId(11);
		obj.setName("komal");
		System.out.println("Id is : " + obj.getId() );
		System.out.println("Name is : " + obj.getName());
	}

}

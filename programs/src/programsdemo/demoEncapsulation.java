package programsdemo;

 class student{
	String name;
	int id;
	
	public String getName() {
		return this.name=name;
		
	}
	public String setName(String name) {
		return this.name=name;
	}
	
	public int getId() {
		return this.id=id;
		
	}
	public int setId(int n) {
		return this.id=id;
	}
}
public class demoEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();
		obj.setName("Komal");
		System.out.println("The name is : "+obj.getName());
		obj.setId(5);
		System.out.println("The ID is : " + obj.getId());
		

	}

}

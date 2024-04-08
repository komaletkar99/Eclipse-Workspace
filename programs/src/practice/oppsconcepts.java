package practice;
class test{
	int id;
	String name;
	public int getId() {
		return this.id=id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class oppsconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//encapsulation
		test obj=new test();
		obj.setId(1);
		obj.setName("komal");
		System.out.println("The id is : " + obj.getId());
		System.out.println("The name is : " + obj.getName());
		
		
		

	}

}

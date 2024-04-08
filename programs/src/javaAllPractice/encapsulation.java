package javaAllPractice;
class parent{
	private int id;
	private String name;
		
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id = id;
	}
	
	public void setName(String name) {
		 this.name=name;
	}
	public String getName() {
		return this.name=name;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		p.setId(01);
		p.setName("komal");
		System.out.println(p.getId());
		System.out.println(p.getName());
		
		
	}

}

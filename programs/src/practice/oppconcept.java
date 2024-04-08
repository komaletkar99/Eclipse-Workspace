package practice;

// encapsulation

class concept{
	String name;
	int id;
	
	public void setId(int id) {
		this.id = id;
		
	}
	public int getId() {
		return this.id = id;
		}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name=name;
	}
	
}
public class oppconcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concept obj = new concept();
	
		obj.setId(10);
		obj.setName("komal");
		System.out.println(obj.getId());
		System.out.println(obj.getName());

	}

}

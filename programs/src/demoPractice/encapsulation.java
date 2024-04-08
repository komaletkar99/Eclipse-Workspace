package demoPractice;
public class encapsulation {
	
	String name;
	int id;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encapsulation demo = new encapsulation();
		demo.setId(10);
		demo.setName("komal");
		
		System.out.println(demo.getId());
		System.out.println(demo.getName());

	}

}

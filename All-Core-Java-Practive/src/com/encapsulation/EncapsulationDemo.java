package com.encapsulation;

public class EncapsulationDemo {
private int id;
private String name;

public int getId() {
	return this.id;
}
public void SetId(int id) {
	this.id=id;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name=name;
}

public String toString(){
	return "Id = " + id + " " + "Name= " + name;
}
	public static void main(String[] args) {
		EncapsulationDemo d = new EncapsulationDemo();
		d.SetId(1001);
		d.setName("Sarthak");
		System.out.println(d.getId());
		System.out.println(d.getName());

	}

}

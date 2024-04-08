package com.oops.concept.demo;

class Check{
	private int id;
	private String name;
	
	public int getId() {
		return this.id=id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getNmae() {
		return this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Check c = new Check();
		c.setId(1001);
		System.out.println(c.getId());
		c.setName("komal");
		System.out.println(c.getNmae());

	}

}

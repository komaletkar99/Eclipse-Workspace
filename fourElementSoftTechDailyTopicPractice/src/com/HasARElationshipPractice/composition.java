package com.HasARElationshipPractice;

public class composition {
	public void cat() {
		System.out.println("cat is eating");
	}

}

class dog{
	composition composition;
	public void dogbark() {
		this.composition = new composition();
		composition.cat();
		System.out.println("dog is barking");
		
	}

}
class Main{
	public static void main(String[] args) {
		dog ob = new dog();
		ob.dogbark();
//		System.out.println(ob);
	}
}


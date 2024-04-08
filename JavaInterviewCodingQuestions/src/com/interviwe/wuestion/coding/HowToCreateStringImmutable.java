package com.interviwe.wuestion.coding;

public class HowToCreateStringImmutable {
	private int i; //here we can use any access modifiers but private is a coding standard
	
	

	public HowToCreateStringImmutable(int num) {
		this.i = num;
	}

	public HowToCreateStringImmutable display(int number) {
		if(this.i == number) {
			return this;
		}
		else {
			return new HowToCreateStringImmutable(number);
		}
	}
	


	public static void main(String[] args) {
		HowToCreateStringImmutable ob = new HowToCreateStringImmutable(10);
		HowToCreateStringImmutable s1 =  ob.display(200);
		HowToCreateStringImmutable s2 = ob.display(10);
		
		System.out.println(ob==s1);
		System.out.println(ob==s2);

	}

}

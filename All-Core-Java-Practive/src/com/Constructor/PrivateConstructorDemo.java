package com.Constructor;
//class Test{
//	PrivateConstructorDemo name = new PrivateConstructorDemo(7,9);
//}

public class PrivateConstructorDemo {
	int i;
	int j;
	
	private PrivateConstructorDemo(int i, int j){
		this.i=i;
		this.j=j;
	}
	private PrivateConstructorDemo(PrivateConstructorDemo p){
		i=p.i;
		j=p.j;
	}
		

	@Override
	public String toString() {
		return "PrivateConstructorDemo [i=" + i + ", j=" + j + "]";
	}
	public static void main(String[] args) {
		PrivateConstructorDemo p = new  PrivateConstructorDemo(2,4);
		PrivateConstructorDemo ob= new  PrivateConstructorDemo(p);
		System.out.println(p);
		System.out.println(ob);

	}

}

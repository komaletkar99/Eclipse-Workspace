package com.Collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();//Default constructor
		Vector v1 = new Vector(10);//Initial value construcor
		Vector v2 = new Vector(10,4);//initial value, Incremental vaue construcytor
		v.addElement(10);
		v.addElement(20);
		//System.out.println(v.capacity());
		
		for(int i=0;i<2;i++) {
			v.addElement(10);;
			v.addElement(40);
			
		}
		
		System.out.println(v.remove(1));
		System.out.println(v);
		System.out.println(v.capacity());

	}

}

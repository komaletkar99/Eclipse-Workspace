package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("komal");
		al.add(200);
		al.add(null);
		al.add("rao");
		al.add(null);
		al.add("komal");
		al.add(200);
		
		for(Object i : al) {
			System.out.print(i + " ");
			
		}

	}

}
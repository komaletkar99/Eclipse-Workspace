package javaAllPractice;

import java.util.HashMap;
import java.util.Map;

public class hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "Komal");
		mp.put(2, "Komu");
		mp.put(1, "Komal");
		mp.put(1, "Komal");
		mp.put(1, "Komal");
		
		System.out.println(mp);

	}

}
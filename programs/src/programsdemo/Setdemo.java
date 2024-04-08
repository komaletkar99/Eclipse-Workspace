package programsdemo;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> list = new HashSet<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(40);
		System.out.println(list);

	}

}

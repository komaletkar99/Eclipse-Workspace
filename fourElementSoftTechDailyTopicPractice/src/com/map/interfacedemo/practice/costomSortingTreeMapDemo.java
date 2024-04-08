package com.map.interfacedemo.practice;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class costomSortingTreeMapDemo{
	private String name;
	public int roll_no;
	
	
	

	public costomSortingTreeMapDemo(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}
	

	public int getRoll_no() {
		return roll_no;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + " " + this.roll_no;
	}
	
}
	class student implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			String s1 = o1.toString();
			String s2 = o2.toString();
			
			return s1.compareTo(s2);
		}
	
	public static void main(String[] args) {
    
     TreeMap<costomSortingTreeMapDemo,Integer> t = new TreeMap();
     t.put(new costomSortingTreeMapDemo("komal", 50), 1);
     t.put(new costomSortingTreeMapDemo("pallavi", 4), 4);
     t.put(new costomSortingTreeMapDemo("monika", 7), 9);
     t.put(new costomSortingTreeMapDemo("kalyani", 9), 10);
     t.put(new costomSortingTreeMapDemo("sarthak", 6), 6);
     
     System.out.println();
     
     for(Map.Entry<costomSortingTreeMapDemo, Integer> entry :
    	 t.entrySet()) {
    	 System.out.println(entry + " ");
     }

	}


}

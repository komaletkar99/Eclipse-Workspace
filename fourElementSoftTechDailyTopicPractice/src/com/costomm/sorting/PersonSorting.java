package com.costomm.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import com.costomm.sorting.Student;

public class PersonSorting {
	public static void main(String[] args) {
		
		TreeMap<Student,String> studentMap = new TreeMap<Student,String>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				 return Integer.compare(o2.getGrade(), o1.getGrade());
			}
		});
		
		studentMap.put(new Student("Anup", 89), "Math");
		studentMap.put(new Student("Komal", 85), "Science");
		studentMap.put(new Student("Pallavi", 90), "History");
		studentMap.put(new Student("Vaibhav", 78), "English");
		
//		System.out.println(studentMap);
		System.out.println("===========================");
		
		for(Map.Entry<Student, String> entry: studentMap.entrySet() ) {
		
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
	}
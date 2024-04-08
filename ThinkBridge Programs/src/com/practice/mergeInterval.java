package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;

	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

}

public class mergeInterval {

	public static void main(String[] args) {

		ArrayList<Interval> al = new ArrayList<Interval>();
			al.add(new Interval(1, 3));
			al.add(new Interval(2, 6));
			al.add(new Interval(8, 10));
			al.add(new Interval(15, 18));
			List<Interval> mergedArray = merge(al);
			
			for (Interval num:mergedArray) {
				System.out.print("[" + num.start + "," + num.end + "]");
				
		}

	}

	public static List<Interval> merge(List<Interval> intervals){
		if(intervals.size()<=1) {
			return intervals;
		}
		
		intervals.sort(Comparator.comparingInt(interval->interval.start));
		List<Interval> merged = new ArrayList<Interval>();
		Interval current = intervals.get(0);
		for(int i=0;i<intervals.size();i++) {
			Interval next = intervals.get(i);
			
			if(current.end >= next.start) {
				current.end = Math.max(current.end, next.end);
			}
			else {
				merged.add(current);
				current=next;
			}
		}
		merged.add(current);
		return merged;
		
		
	}

	

}


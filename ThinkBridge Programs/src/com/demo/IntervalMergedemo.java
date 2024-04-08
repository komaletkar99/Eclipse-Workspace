package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Intervals{
	int start;
	int end;
	public Intervals(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
}
public class IntervalMergedemo {
public static void main(String[] args) {
	List<Intervals> al = new ArrayList<Intervals>();
	al.add(new Intervals(1, 3));
	al.add(new Intervals(2, 6));
	al.add(new Intervals(8, 10));
	al.add(new Intervals(15, 18));
	
	List<Intervals> mergedList = merge(al);
	
	for(Intervals interval : mergedList) {
		System.out.print("[" + interval.start + "," + interval.end + "]");
		
	}
	
	
}

public static List<Intervals> merge(List<Intervals> intervals){
	if(intervals.size()<=1) {
		return intervals;
	}
	intervals.sort(Comparator.comparingInt(interval -> interval.start));
	List<Intervals> merged = new ArrayList<Intervals>();
	Intervals current = intervals.get(0);
	for(int i=0;i<intervals.size();i++) {
		Intervals next = intervals.get(i);
		
		if(current.end>=next.start) {
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

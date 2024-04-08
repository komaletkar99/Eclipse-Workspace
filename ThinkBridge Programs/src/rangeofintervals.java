import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class interval{
	 int start;
	 int end;
	public interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
}
public class rangeofintervals {

	public static void main(String[] args) {
	List al = new ArrayList();
	al.add(new interval(1, 3));
	al.add(new interval(2, 6));
	al.add(new interval(8, 10));
	al.add(new interval(15, 18));
	
	List<interval> mergedIntervals = merge(al);
	System.out.print("[");
	for(interval intervals : mergedIntervals) {
		System.out.print( "[" + intervals.start + "," + intervals.end + "]");
	}
	System.out.print("]");
	}
	
	public static List<interval> merge(List<interval> intervals){
		if(intervals.size()<=1) {
			return intervals;
		}
		
		intervals.sort(Comparator.comparingInt(interval->interval.start));
		List<interval> merged = new ArrayList<interval>();
		interval current = intervals.get(0);
		for(int i=0;i<intervals.size();i++) {
			interval next = intervals.get(i);
			
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

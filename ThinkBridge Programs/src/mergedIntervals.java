import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Intervall{
	int start;
	int end;
	public Intervall(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
}
public class mergedIntervals{
	public static void main(String[] args) {
		List<Intervall> al = new ArrayList<Intervall>();
		al.add(new Intervall(1, 3));
		al.add(new Intervall(2, 6));
		al.add(new Intervall(8, 10));
		al.add(new Intervall(15, 18));
	
	List<Intervall> mergedInterval = merge(al);
		
		for(Intervall interval : mergedInterval) {
			System.out.print("[" + interval.start + "," + interval.end + "]");
			
		}
	}

		public static List<Intervall> merge(List<Intervall> intervals){
			if(intervals.size()<=0) {
				return intervals;
			}
			
			intervals.sort(Comparator.comparingInt(interval->interval.start));
			List<Intervall> mergedList = new ArrayList<Intervall>();
			Intervall current = intervals.get(0);
			
			for(int i=0;i<intervals.size();i++) {
				Intervall next = intervals.get(i);
				if(current.end >= next.start) {
					current.end = Math.max(current.end, next.end);
				}
				else {
					mergedList.add(current);
					current=next;
				}
			}
			mergedList.add(current);
			return mergedList;
		}
	
	
}
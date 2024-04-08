import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreepSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new TestTreeSet()) ;
		t.add(10);
		t.add(34);
		t.add(5);
		t.add(56);
		t.add(20);
		System.out.println(t);
		
	}

}

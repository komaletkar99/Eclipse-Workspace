import java.util.Comparator;

public class TestTreeSet implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (int)o1;
		Integer i2 = (int)o2;
		return -i1.compareTo(i2);
	}

}

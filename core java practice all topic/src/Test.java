import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Test {

	public static void main(String[] args) {
		//Employee e = new Employee();
//		Sort the below list in descending order of Employee name.
		List<Employee> arrayList = new ArrayList();
		arrayList.add(new Employee(20, "XYZ", "25000"));
		arrayList.add(new Employee(40, "ABC", "5000"));
		arrayList.add(new Employee(40, "ABC", "5000"));
		arrayList.add(new Employee(30, "PQR", "15000"));
		arrayList.add(new Employee(20, "XYZ", "25000"));
		
		
	Collections.sort(arrayList, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return -o1.getName().compareTo(o2.getName());
		}
	});
	
	
	for(Employee e : arrayList) {
		System.out.println(e);
	}
	}

	
	
	

}

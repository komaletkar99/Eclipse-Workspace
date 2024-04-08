import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add("komal");
	al.add(23.90);
	al.add(24);
	
//	al.toString();
//	for(Object ob : al) {
		Collections.reverse(al);
		System.out.println(al);
	//}


	}

}

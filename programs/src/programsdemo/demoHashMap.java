package programsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class demoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> obj = new HashMap<String, Integer>();
		obj.put("Komal", 10);
		obj.put("raosaheb", 20);
		obj.put("etkar", 30);
		obj.put("adhav", 40);
		obj.put("Komal", 10);
		obj.put("raosaheb", 20);
		obj.put("etkar", 30);
		obj.put("adhav", 40);
		
		for(Entry<String, Integer> m : obj.entrySet()){    
		    System.out.println(m.getKey()+":"+m.getValue());    
		   }  
		
	
	}

}

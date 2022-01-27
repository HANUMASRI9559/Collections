package Collection;

import java.util.HashMap;

public class HashmapDemo {
public static void main(String[] args) {
	HashMap<Integer, String> places=new HashMap<>();
	places.put(1,"Hyderabad");
	places.put(2,"Vijayawada");
	places.put(3,"Chennia");
	System.out.println("HashMap:"+ places);
	
	//using keySet()
	System.out.println("Keys:" +places.keySet());
	
	//using values()
	System.out.println("Values:"+ places.values());
	
	//using entrySet()
	System.out.println("Key/Value :" +places.entrySet());
	
}
}

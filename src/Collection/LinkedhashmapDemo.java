package Collection;

import java.util.LinkedHashMap;

public class LinkedhashmapDemo {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();
	 linkedHashMap.put(3,"Rose");
	 linkedHashMap.put(2,"Rose");
	 linkedHashMap.put(1,"Rose");
	 linkedHashMap.put(4,"Sunflower");
	 System.out.println("Initial Map:" + linkedHashMap);
	 
	 //Removing 
	 linkedHashMap.remove(4);
	 
	 System.out.println("Updated Map: " + linkedHashMap);
	 
}
}

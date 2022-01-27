package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
public static void main(String[] args) {
	
	//It is not contain duplicate elements
	Set<String> hashset =new  HashSet<>();
	hashset.add("element1");
	hashset.add("element1");
	System.out.println(hashset.toString());
	
	//Can contain null values
	hashset.add(null);
	System.out.println(hashset.toString());
	
	//It is unordered collection
	hashset.add("E2");
	hashset.add("E1");
	hashset.add("E4");
	hashset.add("E3");
	System.out.println(hashset.toString());
}
}

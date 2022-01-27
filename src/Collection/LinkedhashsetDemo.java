package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashsetDemo {
public static void main(String[] args) {
	Set<Integer> linkedhashset=new LinkedHashSet();
	linkedhashset.add(10);
	linkedhashset.add(20);
	linkedhashset.add(30);
	linkedhashset.add(10);
    Iterator<Integer> i=linkedhashset.iterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
}
}

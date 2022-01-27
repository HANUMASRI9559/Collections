package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArraydqDemo {
public static void main(String[] args) {
	Deque<String> dq=new ArrayDeque<>();
	
	//Adding elements at the Back using add()
	dq.add("B");
	
	//Adding elements at the front using addFirst()
	dq.addFirst("A");
	
	//Adding elements at the last using addLast()
	dq.addLast("C");
	
	//add element 
	dq.add("D");
	System.out.println(dq);
	
     Iterator it = dq.iterator();
     System.out.println(it.next() + "");
     System.out.println(it.next() + "");
     System.out.println(it.next() + "");
     
     System.out.println();
     Iterator i=dq.descendingIterator();
     i.hasNext();
     System.out.println(i.next());
     System.out.println(i.next());
     System.out.println(i.next());
     
     
	
			
}
}

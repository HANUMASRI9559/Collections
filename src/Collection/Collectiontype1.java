package Collection;


import java.util.LinkedList;

public class Collectiontype1 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("hi");
	l.add("hello");
	l.add("hi");
	System.out.println("Initial LinkedList:" +l);
	
	//Adding element at specified position
	l.set(1, "hi");
	System.out.println("Updated LinkedList:" +l);
	
	//Adding element at Beginnig
	l.addFirst("good morning");
	System.out.println("After adding first:" +l);
	
	//Adding element at Last
	l.addLast("Bye");
	System.out.println("After adding last:" +l);
	
}
}

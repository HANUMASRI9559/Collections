package Collection;

import java.util.PriorityQueue;

public class PriorityQ {
public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	
	//Adding items to the PQ using add()
	pq.add(10);
	pq.add(20);
	pq.add(30);
	
	//Printing Top elements of PQ 
	System.out.println(pq.peek());
	
	//Printing the Top element and removing it from the PQ
	System.out.println(pq.poll());
	 
	//Printing Top elements again
		System.out.println(pq.peek());
}
}

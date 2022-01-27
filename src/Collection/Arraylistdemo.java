package Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {
public static void main(String[] args) {
ArrayList a=new ArrayList();
	
	//Adding Different elements
	a.add(34);
	a.add(7.8);
	a.add('T');
	a.add("hi");
	a.add(true);
	System.out.println(a);
	System.out.println(a.contains(1));
	 
	//check if the arraylist is empty
	List <String> topprogramminglanguages =new ArrayList <> ();
	System.out.println("is topprogramminglanguages list empty:" +topprogramminglanguages.isEmpty());
	topprogramminglanguages.add("Java");
	topprogramminglanguages.add("Kafka");
	
	//find the size of array
	System.out.println("Here are the top"  + topprogramminglanguages.size() +"programming languages in the world");
	
	//Retrieve the element at a given index
	String bestprogramlanguage =topprogramminglanguages.get(1);
	System.out.println("bestprogramlanguage:" +bestprogramlanguage);
	
	//modify the element at a given index
	topprogramminglanguages.set(0, "kafka");
	System.out.println(topprogramminglanguages);
	
	//Remove the elements
	topprogramminglanguages.remove(1);
	System.out.println(topprogramminglanguages);
	
	//Clear the elements
	topprogramminglanguages.clear();
	System.out.println(topprogramminglanguages);
}
}

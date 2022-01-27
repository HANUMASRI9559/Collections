package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
public static void main(String[] args) {
	Set<StringBuffer> treesSet=new TreeSet<>();
	 treesSet.add(new StringBuffer("K"));
	 treesSet.add(new StringBuffer("A"));
	 treesSet.add(new StringBuffer("F"));
	 treesSet.add(new StringBuffer("K"));
	 treesSet.add(new StringBuffer("A"));
	 System.out.println(treesSet);
}
}

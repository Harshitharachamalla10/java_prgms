package collections_practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("Sanfoundary");
	l.add(10);
	l.add(20);
	l.add(30);
	
	Iterator i=l.iterator();
	  while(i.hasNext())
	        System.out.println(i.next());
	}

}

package collections_practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_Alogs {

	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
        list.add(new Integer(1));
        Iterator i = list.iterator();
        while(i.hasNext())
        	System.out.println(i.next()+"");
	}
}

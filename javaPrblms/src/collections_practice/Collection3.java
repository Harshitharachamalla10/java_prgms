package collections_practice;

import java.util.LinkedList;

public class Collection3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		String s="Sanfoundary";
		for(int i=0;i<s.length();i++)
        {
			l.add(s.charAt(i));
        }
		
		  System.out.println(l);
	}

}

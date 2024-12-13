package collections_practice;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		  al1.add("Ravi");
		  al1.add("Rahul");
		  al1.add("Rohit");		  
		  
		  ArrayList<String> al2=new ArrayList<>();
		  al2.add("Pallavi");
		  al2.add("Sweta");
		  al2.add("Puja");		  

		  al1.addAll(al2); 
		  al1.forEach(x -> System.out.println(x.toUpperCase()));


	}

}

package collections_practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String... a) {
		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("apple");
		ar1.add("Orange");
		ar1.add("Grapes");
		ar1.add("Mango");
		ar1.add("Guava");
		ar1.add("Mango");
		System.out.println(ar1);
		
System.out.println("in Ascending order");
ar1.forEach(System.out::println);

System.out.println("In reverse Order");
ar1.forEach(System.out::println);

	}

}

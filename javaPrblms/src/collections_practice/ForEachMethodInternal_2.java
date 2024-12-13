package collections_practice;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternal_2 {

	public static void main(String[] args) {
		Vector<String> fruits=new Vector<>();
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("kiwi");
		//lambda expression
		
		fruits.forEach(fruit-> System.out.println(fruits));
	}
}
package collections_practice;

import java.util.*;
import java.util.function.Consumer;

public class ForEachMethodInternal {

	public static void main(String[] args) {
		Vector <String> fruits=new Vector<>();
        fruits.add("orange");
        fruits.add("Apple");
        fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		fruits.add("KIWI");	
		//Anonymous inner class
		Consumer<String> cons=new Consumer<>()
				{
			public void accept(String t)
			{
				
		System.out.println(t);
			}
				};
				fruits.forEach(cons);
	}
}

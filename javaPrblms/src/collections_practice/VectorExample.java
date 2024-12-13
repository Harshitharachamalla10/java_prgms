package collections_practice;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> games=new Vector<>();
		games.add("chess");
		games.add("kabaddi");
		games.add("hockey");
		System.out.println(games);
		games.remove(0);//remove based on index
		games.remove("hockey");//remove based on object
		System.out.println("After removing:"+games);
		System.out.println("is list empty:"+games.isEmpty());
		System.out.println("size of the list:"+games.size());
		System.out.println("size of capacity:"+games.capacity());
	}

}

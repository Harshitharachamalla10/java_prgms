package collections_practice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args)
	{
		int Array[]=new int[5];
		for(int i=5;i>0;i--)
		{
			Array[5-i]=i;
			Arrays.fill(Array, 1, 4, 8);
            for (int i1 = 0; i1 < 5 ; i1++)
                System.out.print(Array[i1]);
		}

	}

}

package polymorphism;

public class Addition2 {
	
	public Addition2(int x,int y)
	{
		super();
		System.out.println("sum of two integers:"+(x+y));
	}
	public Addition2(int x,int y,int z)
	{
		this(100,200);
		System.out.println("sum of three integers:"+(x+y+z));
	}
	
	public Addition2(float x, float y)
	{
		this(100,200);
		System.out.println("Sum of two float is :"+(x+y));
	   }
	
}

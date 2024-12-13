package polymorphism;

public class Addition
{
	public Addition(int x, int y)
	{
		System.out.println("sum of two integers:"+(x+y));
		
	}
	public Addition(int x,int y,int z)
	{
		System.out.println("Sum of three integers:"+(x+y+z));
	}
	public  Addition(float x,float y)
	{
		System.out.println("sum of float is:"+(x+y));
	}

}

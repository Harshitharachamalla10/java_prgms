package polymorphism;

public class Addition3
{
	public Addition3()
	{
		this(100);
		System.out.println("No Argument Constructor");
	}

	public Addition3(int i) 
	{
		this(100,200);
		System.out.println("one Argument constructor:"+i);
		
	}
	public Addition3(int i,int j )
	{
		super();
		System.out.println("Two argument constructor:"+(i+j));
		
	}
	
	{
		System.out.println("Instance Block");
	}

}

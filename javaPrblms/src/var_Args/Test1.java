package var_Args;

public class Test1
{
	public void sumOfParameters(int... values)
	{
		int sum=0;
		
		for(int value : values)
		{
			sum=sum+value;
		}
		System.out.println("sum of parameter is :"+sum);
	}
}

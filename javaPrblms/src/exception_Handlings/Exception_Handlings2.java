package exception_Handlings;

public class Exception_Handlings2 {

	public static void main(String[] args) {
	try
	{
		int a,b;
		
		b=0;
		a=5/b;
		System.out.println("A");
	}
	catch(ArithmeticException e)
	{
		System.out.println("B");
	}
	}

}
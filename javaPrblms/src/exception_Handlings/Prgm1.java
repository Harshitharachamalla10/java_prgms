package exception_Handlings;

public class Prgm1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Hello"+""+1 / 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("world");
		}
	
	}

}

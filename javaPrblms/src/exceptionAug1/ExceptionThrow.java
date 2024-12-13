package exceptionAug1;

public class ExceptionThrow {

	public static void main(String[] args) {
		try
		{
			throw new ArithmeticException("Zero division");
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
			System.err.println(e);
		}
		
	}

}

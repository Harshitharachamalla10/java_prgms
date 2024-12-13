package exceptionAug1;

public class ByUsingThrow {

	public static void main(String[] args) {
		System.out.println("hello moha! please welcome to my java application");
		try
		{
			throw new ArithmeticException("devide by zero");
		}
		catch(ArithmeticException e)
		{
			System.out.println("don't devide by zero");
		}
		System.out.println("thank you for visiting moha");
	}

}


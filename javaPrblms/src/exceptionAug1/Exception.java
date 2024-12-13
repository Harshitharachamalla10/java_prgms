package exceptionAug1;

public class Exception {

	public static void main(String[] args)
	{
		ArithmeticException e=new ArithmeticException();
		System.out.println(e);
		
		ArithmeticException e1=new
    ArithmeticException("dividing a num by zero");
		System.out.println(e1);
		}
}
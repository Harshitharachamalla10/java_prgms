package exceptionAug1;

public class PrintStackTrace {

	public static void main(String[] args) {
		System.out.println("main method is started");
		try
		{
			String x="NIT";
			int y=Integer.parseInt(x);
			System.out.println(y);
		}
		catch(NumberFormatException e)
		
		{
			e.printStackTrace();
			System.out.println("in catch block");
			System.err.println(e);
			
			
		}
		finally
		{
			System.out.println("main method ended");
		}
		

	}

}

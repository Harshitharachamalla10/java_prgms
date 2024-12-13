package exceptionAug1;

public class NegativeArrSizeExe2 {

	public static void main(String[] args) {
		try
		{
		int []arr=new int[-10];
		}
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();;
			System.out.println("do not give negative value");
			
		}
		

	}

}

package exceptionAug1;

import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("main method is started!!");
	try
	{
	System.out.println("enter input x is:");
	int x=sc.nextInt();
	System.out.println("enter iput y is:");
	int y=sc.nextInt();
	
	int z=x/y;
	System.out.println(+z);
	}
	catch(ArithmeticException e)
	{
		System.out.println("devide by zero");
	}
	
	sc.close();

	}

}

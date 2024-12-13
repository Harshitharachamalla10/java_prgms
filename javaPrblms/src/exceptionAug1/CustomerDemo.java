package exceptionAug1;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
	System.out.println("Hello client,welcome to my application");
	Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("please enter the value of x:");
			int x=sc.nextInt();
			System.out.println("please enter the value of y:");
			int y=sc.nextInt();
			int result=x/y;
			System.out.println(+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not put zero here");
		}
		sc.close();
		System.out.println("tankyou for visiting my application");
	}
}


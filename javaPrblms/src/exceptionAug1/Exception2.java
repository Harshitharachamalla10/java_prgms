package exceptionAug1;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args)
	{
		System.out.println("main method started!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x:");
		int x=sc.nextInt();
		System.out.println("enter the value of y:");
		int y=sc.nextInt();
		int result=x/y;  //divisible by "0" then program will terminated in the middle called abmormal termination
		System.out.println("result is:"+result);
		System.out.println("main method closed");
		sc.close();
		}
}


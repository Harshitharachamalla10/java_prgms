package inheritance_prblms;

import java.util.Scanner;

public class Trainer
{
	public static void viewStudentProfile(Student student)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id:");
		int id=sc.nextInt();
		if(id==student.getStudetId())
		{
			System.out.println(student);
		}
		else
		{
			System.out.println("Soryy!! Student is not available with this id!!");
		}
		sc.close();
	}

}

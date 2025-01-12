package collections_practice;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) 
	{
		Vector<String> toDoList= new Vector<>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("ToDo List Menu:");
			System.out.println("1.Add Task");
			System.out.println("2. view Task");
			System.out.println("3.mark task as completed");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1:
				//add task
				System.out.print("Enter task description:");
				String task=sc.nextLine();
				toDoList.add(task);
                System.out.println("Task added successfully!\n");
                break;
            case 2:
                // View Tasks
                System.out.println("ToDo List:");
                for (int i = 0; i < toDoList.size(); i++) 
                {
         System.out.println((i + 1) + ". " + toDoList.get(i));
                }
                System.out.println();
                break;
            case 3:
                // Mark Task as Completed
                System.out.print("Enter task number to mark as completed: ");
                int taskNumber = sc.nextInt();
                if (taskNumber >= 1 && taskNumber <= toDoList.size()) 
                {
                    String completedTask = toDoList.remove(taskNumber - 1);
                    System.out.println("Task marked as completed: " + completedTask + "\n");
                } else {
                    System.out.println("Invalid task number!\n");
                }
                break;
            case 4:
                System.out.println("Exiting ToDo List application. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.\n");
        }

    } 
    while (choice != 4);

   
 sc.close();
		}

	}




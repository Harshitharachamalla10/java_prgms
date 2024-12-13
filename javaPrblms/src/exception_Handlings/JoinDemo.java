package exception_Handlings;
class Join extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value is:"+i);
			try
			{
				Thread.sleep(1000);
				
			}
		catch(InterruptedException e)
			{
			e.printStackTrace();
			}
		
	}
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main Thread Started!!!!");
		Join j1=new Join();
		Join j2=new Join();
		Join j3=new Join();
		j1.start();
		j1.join();//main thread will be in waiting state
System.out.println("Main Thread wake up");
	
j2.start();

j3.start();
				
System.out.println("Main Thread Ended");
}
}

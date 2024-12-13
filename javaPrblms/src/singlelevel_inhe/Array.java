package singlelevel_inhe;
class Base5
{
	int a[]= {1,2,3,4,5};
	
}
class Derived5 extends Base5
{
	void even()
	{
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]+"");
			}
		}
	}
}
public class Array {

	public static void main(String[] args) {
		Derived5 d=new Derived5();
		d.even();

	}

}

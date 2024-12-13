package multiLevel_Inheritance;
class A2
{
	public void print()
	{
		System.out.println("A1");
	}
}
class B2 extends A2

{
	public void print()
	{
		System.out.println("B2");
	}
}
class C2 extends B2
{
	public void print()
	{
		super.print();
		System.out.println("C2");
	}
}

public class MultiLevel_2
{
	
	
	
	public static void main(String[] args) {
		A2 obj =new B2();
		B2 obj1=new C2();
		obj.print();
		obj1.print();
	}

}

package singlelevel_inhe;
class Base1
{
	int a=10;
	void display()
	{
		System.out.println(a);
		System.out.println("Base1");
	}
}
class Derived extends Base1
{
	int a=20;
	void display()
	{
		System.out.println(a);
		System.out.println("Derived");
	}
	
	
}

public class Base {

	public static void main(String[] args) {
		Base1 b=new Base1();
		Base1 b1=new Derived();
		b.display();
		b1.display();
	}

}

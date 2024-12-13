package singlelevel_inhe;
class Base6
{
	int x=30;
}
class Derived6 extends Base6
{
	int y=45;
	void display()
	{
		System.out.println(this);
	}
}

public class ClassName {

	public static void main(String[] args) {
		Derived6 obj=new Derived6();
		obj.display();

	}

}

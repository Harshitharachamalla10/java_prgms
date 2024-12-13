package singlelevel_inhe;
class A
{
	char ch='D';
}
class B extends A
{
	void ascii()
	{
		System.out.println((int)ch);
	}
}

public class Ascii {

	public static void main(String[] args) {
		B b=new B();
		b.ascii();
	}

}

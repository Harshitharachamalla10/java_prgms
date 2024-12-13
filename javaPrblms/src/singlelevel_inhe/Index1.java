package singlelevel_inhe;
class Base2
{
	String s="Single Inheritance";
	
}
class Derived2 extends Base2
{
	

	void charAt()
	{
		System.out.println(s.charAt(8));
	}
	
}
public class Index1 {

	public static void main(String[] args) {
		Derived2 d=new Derived2();
		d.charAt();

	}

}

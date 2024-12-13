package singlelevel_inhe;
class Base7
{
	String s="harshitha";
}
class Derived7 extends Base7
{
	Integer y=new Integer(47);
	void display()
	{
		System.out.println(s.getClass().getSuperclass());
        System.out.println(y.getClass().getSuperclass());
    
	}
	
}
public class ClassName1 {

	public static void main(String[] args) {
		Derived7 d=new Derived7();
		d.display();
	}

}

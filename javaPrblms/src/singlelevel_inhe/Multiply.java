package singlelevel_inhe;
class Base8
{
    int a = 37;
}
class Derived8 extends Base8
{
    int b = 45;
    void calculate()
    {
        System.out.println(a*b);
    }
}


public class Multiply {
	
	public static void main(String[] args) {
		Derived8 obj=new Derived8();
		obj.calculate();
	}
}


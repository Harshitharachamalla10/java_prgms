package multiLevel_Inheritance;
class A 
{
    public void Print() 
    {
        System.out.println("A");
    }
}
class B extends A 
{
    public void Print() 
    {
        System.out.println("B");
    }
}
class C extends B 
{
    public void Print() 
    {
        System.out.println("C");
    }
}

public class MultiLevel_1 {

	public static void main(String[] args) {
		B c = new C();
        c.Print();
	}

}

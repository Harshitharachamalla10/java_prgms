package var_Args;

public class Main {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.accept();
		t1.accept(12);
		t1.accept(10,20,30);
		
	}

}
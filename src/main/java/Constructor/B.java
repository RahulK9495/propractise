package Constructor;

public class B extends A{

	int i;
	
	public B()
	{
		System.out.println("This is B() constructor!!!");
	}
	
	public B(int i)
	{
		System.out.println("Inside B (int i) constructor!!");
		this.i=i;
	}
}

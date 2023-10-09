package controlstmts;

public class Parent {

	{
		System.out.println("Inside instance block parent");
	}
	
	public Parent()
	{
		super();
		System.out.println("inside parent no constructor");
	}
	
	static
	{
		System.out.println("inside static block 11-parent");
	}
}

package controlstmts;

public class BlockEx1 extends Parent{
	
	public static void addition(int a, int b)
	{
		int res=a +b;
		System.out.println("Addition of two number is "+ res);
	}
	
	{
		System.out.println("Inside instance block1111");
	}
	{
		System.out.println("Inside instance block2222");
	}
	
	public BlockEx1()
	{
		System.out.println("Inside no arg constructor!!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inside main method");
		
		addition(4,23);
		
		BlockEx1 obj=new BlockEx1();
		
	}

}

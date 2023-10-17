package controlstmts;

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isEven(10));
	
	}
	
	int number=10;
	
	public static String isEven(int num)
	{
		String res= (num%2==0) ? "Even":"odd";
		return res;
	}

}

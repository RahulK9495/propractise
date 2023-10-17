package controlstmts;

public class Ifdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=15;
		
		if (isEven(i))
			System.out.println("Even number");
		else
			System.out.println("Odd Number");
	}
	
	public static boolean isEven(int num)

	{
	//	if (num%2==0)
	//		return true;
	//	else
	//		return false;
		return (num%2==0) ? true : false;
	}
	
}

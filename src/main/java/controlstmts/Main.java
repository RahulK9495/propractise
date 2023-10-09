package controlstmts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=23, b=103 , c=34 ,largest;
		
		if(a>=b)
		{
			if (a>=c)
			{
				largest=a;
			}
			else
				largest=c;
		}
		else if(b>=c)
		{
			largest=b;
		}
		else
		{
			largest=c;
		}
		System.out.println("Largest number ib :"+largest);
	}

}

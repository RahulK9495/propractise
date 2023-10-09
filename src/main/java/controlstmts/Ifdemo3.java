package controlstmts;

public class Ifdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks= 83;
		
		if ((marks >= 50)&&(marks <=60))
		{
			System.out.println("A grade");
		}
		else if ((marks >=61) && (marks <=75))
		{
			System.out.println("B grade");
		}
		else if ((marks >=75)&&(marks <=100))
		{
			System.out.println("A grade");
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}

}

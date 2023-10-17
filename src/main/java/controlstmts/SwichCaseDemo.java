package controlstmts;

import java.util.Scanner;

public class SwichCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your size :");
		
		Scanner sc=new Scanner(System.in);
		
		int size= sc.nextInt();
		
		System.out.println("Your entered size is :"+ size);
		
		switch(size)
		{
		case 28:
			System.out.println("Small");
			break;
			
		case 30:
			System.out.println("Medium");
			break;
			
		case 32:
		System.out.println("Large");
			break;
			
			default:
			System.out.println("You have entered wrong size");
		}
	}

}

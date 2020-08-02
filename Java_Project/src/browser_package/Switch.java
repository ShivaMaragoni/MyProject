package browser_package;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Add");
		System.out.println("2.mul");
		System.out.println("3.div");
		System.out.println("4.sub");
		
		System.out.println("Enter first number");
		int b=sc.nextInt();
		System.out.println("Enter second number");
		int c=sc.nextInt();
		System.out.println("Invalid choice");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		
		case 1:
			System.out.println(b+c);
			
			break;
		case 2:
			System.out.println(b*c);
			break;
			
		case 3:
		System.out.println(b/c);
		break;
		
		case 4:
		System.out.println(b-c);
		default:
			System.out.println("invalid choice");
			
		}
		

	}

}

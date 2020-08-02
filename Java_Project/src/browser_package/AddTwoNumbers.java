package browser_package;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) 
	{
		int x,y,z;
		System.out.println("add to numbers");
		
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		z=x+y;
		
		System.out.println("sum of enter integers"+z);

	}

}

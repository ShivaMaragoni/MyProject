package browser_package;

import java.util.ArrayList;

public final class Loops {

	public static void main(String[] args) 
	{
		
		//for loops
		for (int i = 5; i <=15; i++)
		{
			if (i==8)
				break;
			System.out.println(i);
		
		}

		//While loops
		int x=10;
		while ( x<=15) {
			System.out.println(x);
			x=x+1;
			
		}
		
		//Do While
		int i=0;
		
		do {
			i=i+1;
			System.out.println(i);
		} while (i<4);
	
		//for each
		int list[]= {5,0,27,38};
		
		for (int j : list) {
			System.out.println(j);
		}
			
		// Array List
		ArrayList<String> a=new ArrayList<String>();
		a.add("s");
		a.add("h");
		a.add("i");
		a.add("v");
		a.add("a");
		
	
		System.out.println(a);
			}
			
	  
	}

		
	
	
	

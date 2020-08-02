package browser_package;

public class Data_Types {

	// Instance,static,Local variables
	int s=10;
	static int id=2230;
	public void A() {
		System.out.println("A is Executed");
		System.out.println("static"+ id);
	}
	public void B() {
		System.out.println("B is Executed");
		System.out.println("instance"+ s);
	}
	public void C() {
		System.out.println("C is Executed");
	}	
	public static void main(String[] args)
	{
		System.out.println("shiva kumar");
		Data_Types a= new Data_Types();
		a.A();
		a.B();
		a.C();
		
		// if else statement
		int d=25;
		if (d<40) {
			System.out.println("if statement is passed ");
		}
			else {
				System.out.println("if statement is failed");
				
			}
		
		// else if statement
	     int h=10;
	     if (h==70) {
	    	 System.out.println("h is 70");
	     }else if (h==35) {
	    	 System.out.println("h is 35");
			
		} else {
			System.out.println(" else if statement is passed");
		}
	     
	     //Nested if statement
	    int k=20;     int l=21;
	    if (k==20) {
	    	if (l==21) {
	    		System.out.println("k=20 and l=21");
	    	}
	    }
	    
		}

	}

	



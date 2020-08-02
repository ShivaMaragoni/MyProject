package browser_package;

public class Exep_EH {

	
	public static void main(String[] args) 
	{
		int a[]= {10,15,25,13,244};

		try {
			System.out.println("Acccess Element"+a[5]);
			System.out.println("Testing");
			
		} catch (Exception e) {

			System.out.println("Exeption thrown 123"+e);

		}

		finally {
			System.out.println("First element value"+a[1]);
			System.out.println("Finally statement Executed");
		}

	}

}

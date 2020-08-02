package browser_package;

      public class OverRide1 extends OverRide {

		public void add(int a,int b) {
			System.out.println(a-b);
		}
	public static void main(String[] args) 
	{
		OverRide1 obj= new OverRide1();
		obj.add(34, 37);
		OverRide obj1= new OverRide();
		obj1.add(45, 69);
		
		

	}

}

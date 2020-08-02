package browser_package;

   class S{
	   int a=5;
	   int b=7;
	   public void test() {
		   System.out.println("test");
	   }
   }
   
   class H extends S{
	   int x=12;
	   int y=15;
	   public void test1() {
		   System.out.println("test1");
		   System.out.println(a+b);
	   }
   }
public class C extends H {
	
	   public void test2() {
		   System.out.println("test2");
		   System.out.println(a+b);
		   System.out.println(x+y);
	   }

	public static void main(String[] args) 
	{
		C obj=new C();
		
		obj.test();
		obj.test1();
		obj.test2();

	}

}

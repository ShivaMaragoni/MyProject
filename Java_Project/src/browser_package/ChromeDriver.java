package browser_package;

interface WebDriver{
	
   public void OpenApp();
   public void CloseApp();
   
}
   class FirefoxDriver implements WebDriver {
	   public void OpenApp() {
	   System.out.println("Open Firefox");
   }
   
      public void CloseApp() {
    	  System.out.println("Close Firefox");
      }
   }
public class ChromeDriver implements WebDriver {
	public void  OpenApp() {
		System.out.println("Open Chrome");
	}
	public void CloseApp() {
		System.out.println("Close Chrome");
	}

	public static void main(String[] args)
	{
		WebDriver dr=new FirefoxDriver();
		dr.OpenApp();
		dr.CloseApp();
			//OR	
		FirefoxDriver ff=new FirefoxDriver();
		ff.OpenApp();
		ff.CloseApp();
		   //AND
		WebDriver dr1=new ChromeDriver();
		dr1.OpenApp();
		dr1.CloseApp();
		  //OR
		ChromeDriver ch=new ChromeDriver();
		ch.OpenApp();
		ch.CloseApp();

	
}
}
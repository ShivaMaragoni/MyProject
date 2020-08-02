package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static void OpenApplication() {
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Reporter.log("Application is Opened");
	}
	public static void CloseApplicaton() {
		driver.close();
		Reporter.log("Application is Closed");
	}
	

}

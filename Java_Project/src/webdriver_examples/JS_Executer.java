package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executer {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		//Java Script Executer
		WebElement element=driver.findElement(By.name("Submit"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		System.out.println("login succesfully");
		
		WebElement element1=driver.findElement(By.linkText("Logout"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",element1);
		System.out.println("logout successfully");
		driver.close();

	}

}

package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Time")).click();
		
		driver.findElement(By.id("cmbStartDay")).click();
//		obj.selectByIndex(1);
//		obj.selectByValue("3");
//		obj.selectByVisibleText("Monday");
		
	
  
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout confirm");
		driver.close();



	}

}

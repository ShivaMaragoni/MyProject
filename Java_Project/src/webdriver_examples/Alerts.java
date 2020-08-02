package webdriver_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");

		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		
		//Alerts
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.getText();
	}

}
